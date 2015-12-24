package ws.l10n.client;

import org.junit.Test;
import ws.l10n.client.impl.ReloadableMessageContextImpl;
import ws.l10n.rest.client.MessageBundle;

/**
 * @author Serhii Bohutskyi
 */
public class ReloadableMessageContextTest {

    @Test
    public void test() throws InterruptedException {
        Options options = new Options()
                .setServiceUrl("http://localhost:9000/api/m")
                .setAccessToken("C85hg")
                .setBundleUid("C85hg")
                .setVersion("1 ")
                .setReloadPeriod(1000);
        ReloadableMessageContext messageContext = new ReloadableMessageContextImpl(options);
        Iterable<MessageBundle> messageBundles = messageContext.getMessageBundles();
        Thread.sleep(100000000);
        System.out.println(messageBundles);
    }
}
