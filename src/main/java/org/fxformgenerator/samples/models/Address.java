package org.fxformgenerator.samples.models;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by giovanni on 4/8/16.
 */
public class Address {

	private final IntegerProperty       id             = new SimpleIntegerProperty();
	private final StringProperty        street         = new SimpleStringProperty();
	private final SimpleIntegerProperty postalCode     = new SimpleIntegerProperty();
	private final StringProperty        city           = new SimpleStringProperty();
	private final ObjectProperty<State> state          = new SimpleObjectProperty<>();
	private final BooleanProperty       billingAddress = new SimpleBooleanProperty(true);

	////////////////////////////////////////////////////////////////////////////

	public int getId() {
		return id.get();
	}

	public IntegerProperty idProperty() {
		return id;
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getStreet() {
		return street.get();
	}

	public StringProperty streetProperty() {
		return street;
	}

	public void setStreet(String street) {
		this.street.set(street);
	}

	public int getPostalCode() {
		return postalCode.get();
	}

	public SimpleIntegerProperty postalCodeProperty() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode.set(postalCode);
	}

	public String getCity() {
		return city.get();
	}

	public StringProperty cityProperty() {
		return city;
	}

	public void setCity(String city) {
		this.city.set(city);
	}

	public boolean getBillingAddress() {
		return billingAddress.get();
	}

	public BooleanProperty billingAddressProperty() {
		return billingAddress;
	}

	public void setBillingAddress(boolean billingAddress) {
		this.billingAddress.set(billingAddress);
	}

	public State getState() {
		return state.get();
	}

	public ObjectProperty<State> stateProperty() {
		return state;
	}

	public void setState(State state) {
		this.state.set(state);
	}
}
