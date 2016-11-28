package com.yahoo.elide.contrib.swagger;


public class Items extends SwaggerComponent {
    private static final String[] REQUIRED = {"type"};
    public Enums.Type type;
    public Enums.DataType format;
    public Items items;
    public Enums.Format collectionFormat;
    public Object defaultValue;
    public int maximum;
    public boolean exclusiveMaximum;
    public int minimum;
    public boolean exclusiveMinimum;
    public int maxLength;
    public int minLength;
    public String pattern;
    public int maxItems;
    public int minItems;
    public boolean uniqueItems;
    public Object[] enumeration;
    public int multipleOf;

    @Override
    public void checkRequired() throws SwaggerValidationException
    {
        super.checkRequired();

        if(type == Enums.Type.ARRAY && items == null)
            throw new SwaggerValidationException("If the type is an array, then the items (ie, the thing describing what's in the array) can't be null");
    }
}
