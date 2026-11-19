package com.google.gson;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum FieldNamingPolicy implements InterfaceC3835a {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.6
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.7
        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.gson.FieldNamingPolicy, com.google.gson.InterfaceC3835a
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    FieldNamingPolicy(C38221 c38221) {
    }

    public static String separateCamelCase(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    @Override // com.google.gson.InterfaceC3835a
    public List alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.gson.InterfaceC3835a
    public abstract /* synthetic */ String translateName(Field field);
}
