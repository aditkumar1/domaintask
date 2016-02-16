package domain1task

class DocumentResource extends Resource {
    String filePath;
    Date dateCreated;
    Date lastUpdated;

    static constraints = {
        filePath blank:false, nullable:false;
    }


}
