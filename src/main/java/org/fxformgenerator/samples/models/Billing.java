package org.fxformgenerator.samples.models;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * Created by TEA on 02/05/2016.
 */
public class Billing {

	private final IntegerProperty id             = new SimpleIntegerProperty();
	private final StringProperty  name           = new SimpleStringProperty();
	private final StringProperty  description    = new SimpleStringProperty();
	private final DoubleProperty  quantity       = new SimpleDoubleProperty();
	private final BooleanProperty createReminder = new SimpleBooleanProperty();
	private final BooleanProperty paid           = new SimpleBooleanProperty();

	private LocalDate dueDate = LocalDate.now();

	////////////////////////////////////////////////////////////////////////////
	// Getter and setters

	public int getId() {
		return id.get();
	}

	public IntegerProperty idProperty() {
		return id;
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getName() {
		return name.get();
	}

	public StringProperty nameProperty() {
		return name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public String getDescription() {
		return description.get();
	}

	public StringProperty descriptionProperty() {
		return description;
	}

	public void setDescription(String description) {
		this.description.set(description);
	}

	public double getQuantity() {
		return quantity.get();
	}

	public DoubleProperty quantityProperty() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity.set(quantity);
	}

	public boolean getCreateReminder() {
		return createReminder.get();
	}

	public BooleanProperty createReminderProperty() {
		return createReminder;
	}

	public void setCreateReminder(boolean createReminder) {
		this.createReminder.set(createReminder);
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public boolean getPaid() {
		return paid.get();
	}

	public BooleanProperty paidProperty() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid.set(paid);
	}
}
