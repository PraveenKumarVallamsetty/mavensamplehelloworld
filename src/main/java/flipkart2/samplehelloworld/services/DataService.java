package flipkart2.samplehelloworld.services;

import com.manywho.sdk.entities.run.elements.type.ObjectCollection;
import com.manywho.sdk.entities.run.elements.type.ObjectDataResponse;
import flipkart2.samplehelloworld.configuration.Configuration;

public class DataService {
    public ObjectDataResponse loadExamples(Configuration configurationValues) {
        // Load some data from a database or API, then convert back into ManyWho Objects (ObjectCollection)

        return new ObjectDataResponse();
    }

    public ObjectDataResponse saveExample(Configuration configurationValues, ObjectCollection objectData) {
        // Save some data to a database or API

        return new ObjectDataResponse();
    }
}
