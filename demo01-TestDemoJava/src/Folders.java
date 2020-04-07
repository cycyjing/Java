import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        final List<String> names = new ArrayList<>();

        final Document doc = loadXMLFromString(xml);
        // Normalize the XML Structure
        doc.getDocumentElement().normalize();

        final NodeList nList = doc.getElementsByTagName("folder");
        for (int i = 0; i < nList.getLength(); ++i) {
            final Node node = nList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                final Element e = (Element) node;
                final String name = e.getAttribute("name");
                if (name.length() > 0 && name.charAt(0) == startingLetter)
                    names.add(name);
            }
        }

        return names;
    }

    private static Document loadXMLFromString(String xml) throws Exception {
        final DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        return builder.parse(new InputSource(new StringReader(xml)));
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for (String name : names)
            System.out.println(name);
    }
}