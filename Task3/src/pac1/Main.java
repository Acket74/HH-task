package pac1;

import java.util.Calendar;
import java.util.Date;

class SmartPhone {
    String model;

    Date date;

    String revision;

    public SmartPhone(String model, Date date, String revision) {
        this.model = model;
        this.date = date;
        this.revision = revision;
    }

    // wrong:
    // must be always same for each entity
    // must return same value for equal objects.
    // must override base method

    /*public int hashCode() {
        return new Random().nextInt();
    }*/

    @Override
    public int hashCode() {
        return (model + date + revision).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SmartPhone that = (SmartPhone) o;

        if (!date.equals(that.date)) {
            return false;
        }
        if (!model.equals(that.model)) {
            return false;
        }
        if (!revision.equals(that.revision)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Date date1 = new Date(Calendar.getInstance().getTimeInMillis());
        Date date2 = new Date(Calendar.getInstance().getTimeInMillis());
        SmartPhone smartPhone1 = new SmartPhone("a", date1, "b");
        SmartPhone smartPhone2 = new SmartPhone("a", date1, "b");
        SmartPhone smartPhone3 = new SmartPhone("c", date1, "b");
        SmartPhone smartPhone4 = new SmartPhone("c", date2, "b");
        System.out.println(smartPhone1.equals(smartPhone2));
        System.out.println(smartPhone1.equals(smartPhone3));
        System.out.println(smartPhone1.equals(smartPhone4));
    }
    /**
     * setters, getters and
     * some important methods
     *
     *
     */
}
