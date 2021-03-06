/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables;


import ceylon.language.String;

import com.github.bjansen.ceylon.jooqadapter.StringConverter;

import gen.example.jooq.Sakila;
import gen.example.jooq.tables.records.SalesByStoreRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class SalesByStore extends TableImpl<SalesByStoreRecord> {

	private static final long serialVersionUID = 1282661376;

	/**
	 * The reference instance of <code>sakila.sales_by_store</code>
	 */
	public static final SalesByStore salesByStore = new SalesByStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SalesByStoreRecord> getRecordType() {
		return SalesByStoreRecord.class;
	}

	/**
	 * The column <code>sakila.sales_by_store.store</code>.
	 */
	public final TableField<SalesByStoreRecord, String> store = createField("store", org.jooq.impl.SQLDataType.VARCHAR.length(101), this, "", new StringConverter());

	/**
	 * The column <code>sakila.sales_by_store.manager</code>.
	 */
	public final TableField<SalesByStoreRecord, String> manager = createField("manager", org.jooq.impl.SQLDataType.VARCHAR.length(91), this, "", new StringConverter());

	/**
	 * The column <code>sakila.sales_by_store.total_sales</code>.
	 */
	public final TableField<SalesByStoreRecord, BigDecimal> totalSales = createField("total_sales", org.jooq.impl.SQLDataType.DECIMAL.precision(27, 2), this, "");

	/**
	 * Create a <code>sakila.sales_by_store</code> table reference
	 */
	public SalesByStore() {
		this("sales_by_store", null);
	}

	/**
	 * Create an aliased <code>sakila.sales_by_store</code> table reference
	 */
	public SalesByStore(java.lang.String alias) {
		this(alias, salesByStore);
	}

	private SalesByStore(java.lang.String alias, Table<SalesByStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private SalesByStore(java.lang.String alias, Table<SalesByStoreRecord> aliased, Field<?>[] parameters) {
		super(alias, Sakila.sakila, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesByStore as(java.lang.String alias) {
		return new SalesByStore(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SalesByStore rename(java.lang.String name) {
		return new SalesByStore(name, null);
	}
}
