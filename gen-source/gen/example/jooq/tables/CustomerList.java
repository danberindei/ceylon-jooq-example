/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables;


import ceylon.language.String;

import example.jooqconverters.StringConverter;

import gen.example.jooq.Sakila;
import gen.example.jooq.tables.records.CustomerListRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
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
public class CustomerList extends TableImpl<CustomerListRecord> {

	private static final long serialVersionUID = 1713370906;

	/**
	 * The reference instance of <code>sakila.customer_list</code>
	 */
	public static final CustomerList customerList = new CustomerList();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CustomerListRecord> getRecordType() {
		return CustomerListRecord.class;
	}

	/**
	 * The column <code>sakila.customer_list.ID</code>.
	 */
	public final TableField<CustomerListRecord, UShort> id = createField("ID", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sakila.customer_list.name</code>.
	 */
	public final TableField<CustomerListRecord, String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(91), this, "", new StringConverter());

	/**
	 * The column <code>sakila.customer_list.address</code>.
	 */
	public final TableField<CustomerListRecord, String> address = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.customer_list.zip code</code>.
	 */
	public final TableField<CustomerListRecord, String> zip_code = createField("zip code", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "", new StringConverter());

	/**
	 * The column <code>sakila.customer_list.phone</code>.
	 */
	public final TableField<CustomerListRecord, String> phone = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.customer_list.city</code>.
	 */
	public final TableField<CustomerListRecord, String> city = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.customer_list.country</code>.
	 */
	public final TableField<CustomerListRecord, String> country = createField("country", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.customer_list.notes</code>.
	 */
	public final TableField<CustomerListRecord, String> notes = createField("notes", org.jooq.impl.SQLDataType.VARCHAR.length(6).nullable(false).defaulted(true), this, "", new StringConverter());

	/**
	 * The column <code>sakila.customer_list.SID</code>.
	 */
	public final TableField<CustomerListRecord, UByte> sid = createField("SID", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>sakila.customer_list</code> table reference
	 */
	public CustomerList() {
		this("customer_list", null);
	}

	/**
	 * Create an aliased <code>sakila.customer_list</code> table reference
	 */
	public CustomerList(java.lang.String alias) {
		this(alias, customerList);
	}

	private CustomerList(java.lang.String alias, Table<CustomerListRecord> aliased) {
		this(alias, aliased, null);
	}

	private CustomerList(java.lang.String alias, Table<CustomerListRecord> aliased, Field<?>[] parameters) {
		super(alias, Sakila.sakila, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CustomerList as(java.lang.String alias) {
		return new CustomerList(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CustomerList rename(java.lang.String name) {
		return new CustomerList(name, null);
	}
}