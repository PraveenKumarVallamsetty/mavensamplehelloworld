package flipkart2.samplehelloworld.actions;

import com.manywho.sdk.entities.describe.DescribeValue;
import com.manywho.sdk.entities.describe.DescribeValueCollection;
import com.manywho.sdk.enums.ContentType;
import com.manywho.sdk.services.describe.actions.AbstractAction;
import flipkart2.samplehelloworld.types.Example;

public class SendExample extends AbstractAction {
    @Override
    public String getUriPart() {
        return "samplehelloworld";
    }

    @Override
    public String getDeveloperName() {
        return "Example Action";
    }

    @Override
    public String getDeveloperSummary() {
        return "This is an samplehelloworld action for a ManyWho Service";
    }

    @Override
    public DescribeValueCollection getServiceInputs() {
        return new DescribeValueCollection() {{
            add(new DescribeValue("ID", ContentType.String, true));
        }};
    }

    @Override
    public DescribeValueCollection getServiceOutputs() {
        return new DescribeValueCollection() {{
            add(new DescribeValue("Example", ContentType.Object, true, null, Example.NAME));
        }};
    }
}
