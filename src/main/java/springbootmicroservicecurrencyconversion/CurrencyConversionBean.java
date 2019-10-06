package springbootmicroservicecurrencyconversion;

import java.math.BigDecimal;

public class CurrencyConversionBean {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CurrencyConversionBean() {

    }

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
                                  BigDecimal totalCalculatedAmount, int port) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public CurrencyConversionBean setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public CurrencyConversionBean setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public CurrencyConversionBean setTo(String to) {
        this.to = to;
        return this;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public CurrencyConversionBean setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
        return this;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public CurrencyConversionBean setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public CurrencyConversionBean setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
        return this;
    }

    public int getPort() {
        return port;
    }

    public CurrencyConversionBean setPort(int port) {
        this.port = port;
        return this;
    }
}