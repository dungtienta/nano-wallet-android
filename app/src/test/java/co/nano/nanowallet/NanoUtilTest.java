package co.nano.nanowallet;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by szeidner on 01/02/2018.
 */

public class NanoUtilTest {

    @Test
    public void seedToPrivate() throws Exception {
        String seed = "387151e6ea2a42eead77f26b1c0fc4c485df4e78902ada848ff97fc5dce85e81";

        long lStartTime = System.nanoTime();

        String privateKey = NanoUtil.seedToPrivate(seed);

        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Seed to Private: " + output / 1000000);

        assertEquals(privateKey, "C5469190B25E850CED298E57723258F716A4E1956AC2BC60DA023300476D1212");
    }

    @Test
    public void privateToPublic() throws Exception {
        String privateKey = "C5469190B25E850CED298E57723258F716A4E1956AC2BC60DA023300476D1212";

        long lStartTime = System.nanoTime();

        String publicKey = NanoUtil.privateToPublic(privateKey);

        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Private to Public: " + output / 1000000);

        assertEquals(publicKey, "9D473FD0CAD0D43DD79B9FDCAC6FED51EDE7E78279A84142290487CF864B8B8F");
    }

    @Test
    public void publicToAddress() throws Exception {
        String publicKey = "8933B4083FE0E42A97FF0B7E16B9B2CEF93D31318700B328D6CF6CE931BBF8D4";

        long lStartTime = System.nanoTime();

        String address = NanoUtil.publicToAddress(publicKey);

        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Public to Address: " + output / 1000000);

        assertEquals(address, "xrb_34bmpi65zr967cdzy4uy4twu7mqs9nrm53r1penffmuex6ruqy8nxp7ms1h1");
    }

}
