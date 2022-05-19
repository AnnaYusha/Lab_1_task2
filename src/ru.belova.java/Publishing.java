package ru.belova.java;

public class Publishing { //издательстве с атрибутами «Название издательства» и«Город»;
    private String publishing;
    private String city;

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        if (publishing == null || publishing.length() <= 0) {
            throw new IllegalArgumentException("не заполнено publishing");
        }
        this.publishing = publishing;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.length() <= 0) {
            throw new IllegalArgumentException(" не заполнен city");
        }
        this.city = city;
    }

    public Publishing(String publishing, String city) {
        this.publishing = publishing;
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "издательство = " + publishing +
                        ", город = " + city;
    }


}




