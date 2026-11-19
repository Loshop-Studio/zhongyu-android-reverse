package androidx.compose.p011ui.autofill;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\u0011\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0002\u0082\u0001\u0001\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/autofill/ContentType;", "", "plus", "other", "Companion", "Landroidx/compose/ui/autofill/AndroidContentType;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ContentType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bI\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010'\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0011\u0010/\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006R\u0011\u00101\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0011\u00103\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0011\u00105\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0006R\u0011\u00107\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u0011\u00109\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0011\u0010?\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0006R\u0011\u0010A\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0006R\u0011\u0010C\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006R\u0011\u0010E\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0006R\u0011\u0010G\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0006R\u0011\u0010I\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0006R\u0011\u0010K\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0006¨\u0006M"}, m5110d2 = {"Landroidx/compose/ui/autofill/ContentType$Companion;", "", "()V", "AddressAuxiliaryDetails", "Landroidx/compose/ui/autofill/ContentType;", "getAddressAuxiliaryDetails", "()Landroidx/compose/ui/autofill/ContentType;", "AddressCountry", "getAddressCountry", "AddressLocality", "getAddressLocality", "AddressRegion", "getAddressRegion", "AddressStreet", "getAddressStreet", "BirthDateDay", "getBirthDateDay", "BirthDateFull", "getBirthDateFull", "BirthDateMonth", "getBirthDateMonth", "BirthDateYear", "getBirthDateYear", "CreditCardExpirationDate", "getCreditCardExpirationDate", "CreditCardExpirationDay", "getCreditCardExpirationDay", "CreditCardExpirationMonth", "getCreditCardExpirationMonth", "CreditCardExpirationYear", "getCreditCardExpirationYear", "CreditCardNumber", "getCreditCardNumber", "CreditCardSecurityCode", "getCreditCardSecurityCode", "EmailAddress", "getEmailAddress", "Gender", "getGender", "NewPassword", "getNewPassword", "NewUsername", "getNewUsername", "Password", "getPassword", "PersonFirstName", "getPersonFirstName", "PersonFullName", "getPersonFullName", "PersonLastName", "getPersonLastName", "PersonMiddleInitial", "getPersonMiddleInitial", "PersonMiddleName", "getPersonMiddleName", "PersonNamePrefix", "getPersonNamePrefix", "PersonNameSuffix", "getPersonNameSuffix", "PhoneCountryCode", "getPhoneCountryCode", "PhoneNumber", "getPhoneNumber", "PhoneNumberDevice", "getPhoneNumberDevice", "PhoneNumberNational", "getPhoneNumberNational", "PostalAddress", "getPostalAddress", "PostalCode", "getPostalCode", "PostalCodeExtended", "getPostalCodeExtended", "SmsOtpCode", "getSmsOtpCode", "Username", "getUsername", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ContentType Username = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_USERNAME);

        @NotNull
        private static final ContentType Password = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PASSWORD);

        @NotNull
        private static final ContentType EmailAddress = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);

        @NotNull
        private static final ContentType NewUsername = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_NEW_USERNAME);

        @NotNull
        private static final ContentType NewPassword = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);

        @NotNull
        private static final ContentType PostalAddress = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS);

        @NotNull
        private static final ContentType PostalCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_CODE);

        @NotNull
        private static final ContentType CreditCardNumber = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER);

        @NotNull
        private static final ContentType CreditCardSecurityCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE);

        @NotNull
        private static final ContentType CreditCardExpirationDate = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE);

        @NotNull
        private static final ContentType CreditCardExpirationMonth = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH);

        @NotNull
        private static final ContentType CreditCardExpirationYear = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR);

        @NotNull
        private static final ContentType CreditCardExpirationDay = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY);

        @NotNull
        private static final ContentType AddressCountry = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY);

        @NotNull
        private static final ContentType AddressRegion = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION);

        @NotNull
        private static final ContentType AddressLocality = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY);

        @NotNull
        private static final ContentType AddressStreet = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS);

        @NotNull
        private static final ContentType AddressAuxiliaryDetails = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS);

        @NotNull
        private static final ContentType PostalCodeExtended = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);

        @NotNull
        private static final ContentType PersonFullName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME);

        @NotNull
        private static final ContentType PersonFirstName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN);

        @NotNull
        private static final ContentType PersonLastName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY);

        @NotNull
        private static final ContentType PersonMiddleName = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE);

        @NotNull
        private static final ContentType PersonMiddleInitial = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL);

        @NotNull
        private static final ContentType PersonNamePrefix = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX);

        @NotNull
        private static final ContentType PersonNameSuffix = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX);

        @NotNull
        private static final ContentType PhoneNumber = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_NUMBER);

        @NotNull
        private static final ContentType PhoneNumberDevice = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE);

        @NotNull
        private static final ContentType PhoneCountryCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE);

        @NotNull
        private static final ContentType PhoneNumberNational = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_PHONE_NATIONAL);

        @NotNull
        private static final ContentType Gender = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_GENDER);

        @NotNull
        private static final ContentType BirthDateFull = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL);

        @NotNull
        private static final ContentType BirthDateDay = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY);

        @NotNull
        private static final ContentType BirthDateMonth = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH);

        @NotNull
        private static final ContentType BirthDateYear = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR);

        @NotNull
        private static final ContentType SmsOtpCode = ContentType_androidKt.ContentType(HintConstants.AUTOFILL_HINT_SMS_OTP);

        private Companion() {
        }

        @NotNull
        public final ContentType getAddressAuxiliaryDetails() {
            return AddressAuxiliaryDetails;
        }

        @NotNull
        public final ContentType getAddressCountry() {
            return AddressCountry;
        }

        @NotNull
        public final ContentType getAddressLocality() {
            return AddressLocality;
        }

        @NotNull
        public final ContentType getAddressRegion() {
            return AddressRegion;
        }

        @NotNull
        public final ContentType getAddressStreet() {
            return AddressStreet;
        }

        @NotNull
        public final ContentType getBirthDateDay() {
            return BirthDateDay;
        }

        @NotNull
        public final ContentType getBirthDateFull() {
            return BirthDateFull;
        }

        @NotNull
        public final ContentType getBirthDateMonth() {
            return BirthDateMonth;
        }

        @NotNull
        public final ContentType getBirthDateYear() {
            return BirthDateYear;
        }

        @NotNull
        public final ContentType getCreditCardExpirationDate() {
            return CreditCardExpirationDate;
        }

        @NotNull
        public final ContentType getCreditCardExpirationDay() {
            return CreditCardExpirationDay;
        }

        @NotNull
        public final ContentType getCreditCardExpirationMonth() {
            return CreditCardExpirationMonth;
        }

        @NotNull
        public final ContentType getCreditCardExpirationYear() {
            return CreditCardExpirationYear;
        }

        @NotNull
        public final ContentType getCreditCardNumber() {
            return CreditCardNumber;
        }

        @NotNull
        public final ContentType getCreditCardSecurityCode() {
            return CreditCardSecurityCode;
        }

        @NotNull
        public final ContentType getEmailAddress() {
            return EmailAddress;
        }

        @NotNull
        public final ContentType getGender() {
            return Gender;
        }

        @NotNull
        public final ContentType getNewPassword() {
            return NewPassword;
        }

        @NotNull
        public final ContentType getNewUsername() {
            return NewUsername;
        }

        @NotNull
        public final ContentType getPassword() {
            return Password;
        }

        @NotNull
        public final ContentType getPersonFirstName() {
            return PersonFirstName;
        }

        @NotNull
        public final ContentType getPersonFullName() {
            return PersonFullName;
        }

        @NotNull
        public final ContentType getPersonLastName() {
            return PersonLastName;
        }

        @NotNull
        public final ContentType getPersonMiddleInitial() {
            return PersonMiddleInitial;
        }

        @NotNull
        public final ContentType getPersonMiddleName() {
            return PersonMiddleName;
        }

        @NotNull
        public final ContentType getPersonNamePrefix() {
            return PersonNamePrefix;
        }

        @NotNull
        public final ContentType getPersonNameSuffix() {
            return PersonNameSuffix;
        }

        @NotNull
        public final ContentType getPhoneCountryCode() {
            return PhoneCountryCode;
        }

        @NotNull
        public final ContentType getPhoneNumber() {
            return PhoneNumber;
        }

        @NotNull
        public final ContentType getPhoneNumberDevice() {
            return PhoneNumberDevice;
        }

        @NotNull
        public final ContentType getPhoneNumberNational() {
            return PhoneNumberNational;
        }

        @NotNull
        public final ContentType getPostalAddress() {
            return PostalAddress;
        }

        @NotNull
        public final ContentType getPostalCode() {
            return PostalCode;
        }

        @NotNull
        public final ContentType getPostalCodeExtended() {
            return PostalCodeExtended;
        }

        @NotNull
        public final ContentType getSmsOtpCode() {
            return SmsOtpCode;
        }

        @NotNull
        public final ContentType getUsername() {
            return Username;
        }
    }

    @NotNull
    ContentType plus(@NotNull ContentType other);
}
