package dev.tomco.featuretogglelib;

public class Feature {


    private String _id;
    private String beginning_date;
    private String created_at;
    private String description;
    private String expiration_date;
    private String name;
    private String updated_at;

    public Feature() {

    }

    public Feature(String beginning_date, String created_at, String description, String expiration_date, String name, String updated_at) {
        this.beginning_date = beginning_date;
        this.created_at = created_at;
        this.description = description;
        this.expiration_date = expiration_date;
        this.name = name;
        this.updated_at = updated_at;
    }

    public String get_id() {
        return _id;
    }

    public Feature set_id(String _id) {
        this._id = _id;
        return this;
    }

    public String getBeginning_date() {
        return beginning_date;
    }

    public Feature setBeginning_date(String beginning_date) {
        this.beginning_date = beginning_date;
        return this;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Feature setCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Feature setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public Feature setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
        return this;
    }

    public String getName() {
        return name;
    }

    public Feature setName(String name) {
        this.name = name;
        return this;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public Feature setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }


}
