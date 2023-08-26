package ues.za20003;

public class Appointment {

    private Pet pet;
    private Record record;
    private double cost;

    public Appointment() {}

    public Appointment(Pet pet, Record record, double cost) {
        this.pet = pet;
        this.record = record;
        this.cost = cost;
    }

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

    @Override
    public String toString() {
        return this.pet + "\n" + this.record + "\nCosto de la Cita: $" + this.cost;
    }
}
