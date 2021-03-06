/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables.records;


import ceylon.language.String;

import gen.example.jooq.tables.NicerButSlowerFilmList;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NicerButSlowerFilmListRecord extends TableRecordImpl<NicerButSlowerFilmListRecord> implements Record8<UShort, String, java.lang.String, String, BigDecimal, UShort, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1692925210;

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.FID</code>.
	 */
	public void setFid(UShort value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.FID</code>.
	 */
	public UShort getFid() {
		return (UShort) getValue(0);
	}

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.title</code>.
	 */
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.title</code>.
	 */
	public String getTitle() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.category</code>.
	 */
	public void setCategory(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.category</code>.
	 */
	public String getCategory() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.price</code>.
	 */
	public void setPrice(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.price</code>.
	 */
	public BigDecimal getPrice() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.length</code>.
	 */
	public void setLength(UShort value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.length</code>.
	 */
	public UShort getLength() {
		return (UShort) getValue(5);
	}

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.rating</code>.
	 */
	public void setRating(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.rating</code>.
	 */
	public java.lang.String getRating() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>sakila.nicer_but_slower_film_list.actors</code>.
	 */
	public void setActors(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sakila.nicer_but_slower_film_list.actors</code>.
	 */
	public java.lang.String getActors() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<UShort, String, java.lang.String, String, BigDecimal, UShort, java.lang.String, java.lang.String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<UShort, String, java.lang.String, String, BigDecimal, UShort, java.lang.String, java.lang.String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UShort> field1() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.fid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.title;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<java.lang.String> field3() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.description;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.category;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UShort> field6() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.length;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<java.lang.String> field7() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.rating;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<java.lang.String> field8() {
		return NicerButSlowerFilmList.nicerButSlowerFilmList.actors;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UShort value1() {
		return getFid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCategory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UShort value6() {
		return getLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getActors();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value1(UShort value) {
		setFid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value3(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value4(String value) {
		setCategory(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value5(BigDecimal value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value6(UShort value) {
		setLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value7(java.lang.String value) {
		setRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord value8(java.lang.String value) {
		setActors(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NicerButSlowerFilmListRecord values(UShort value1, String value2, java.lang.String value3, String value4, BigDecimal value5, UShort value6, java.lang.String value7, java.lang.String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NicerButSlowerFilmListRecord
	 */
	public NicerButSlowerFilmListRecord() {
		super(NicerButSlowerFilmList.nicerButSlowerFilmList);
	}

	/**
	 * Create a detached, initialised NicerButSlowerFilmListRecord
	 */
	public NicerButSlowerFilmListRecord(UShort fid, String title, java.lang.String description, String category, BigDecimal price, UShort length, java.lang.String rating, java.lang.String actors) {
		super(NicerButSlowerFilmList.nicerButSlowerFilmList);

		setValue(0, fid);
		setValue(1, title);
		setValue(2, description);
		setValue(3, category);
		setValue(4, price);
		setValue(5, length);
		setValue(6, rating);
		setValue(7, actors);
	}
}
