package androidx.compose.p013ui.autofill;

import androidx.autofill.HintConstants;
import java.util.HashMap;
import kotlin.collections.AbstractC9080a;
import p123h7.AbstractC8726f;

/* loaded from: classes2.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes = AbstractC9080a.m15945j(AbstractC8726f.m14230a(AutofillType.EmailAddress, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), AbstractC8726f.m14230a(AutofillType.Username, HintConstants.AUTOFILL_HINT_USERNAME), AbstractC8726f.m14230a(AutofillType.Password, HintConstants.AUTOFILL_HINT_PASSWORD), AbstractC8726f.m14230a(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), AbstractC8726f.m14230a(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), AbstractC8726f.m14230a(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), AbstractC8726f.m14230a(AutofillType.PostalCode, HintConstants.AUTOFILL_HINT_POSTAL_CODE), AbstractC8726f.m14230a(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), AbstractC8726f.m14230a(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), AbstractC8726f.m14230a(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), AbstractC8726f.m14230a(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), AbstractC8726f.m14230a(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), AbstractC8726f.m14230a(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), AbstractC8726f.m14230a(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), AbstractC8726f.m14230a(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), AbstractC8726f.m14230a(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), AbstractC8726f.m14230a(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), AbstractC8726f.m14230a(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), AbstractC8726f.m14230a(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), AbstractC8726f.m14230a(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), AbstractC8726f.m14230a(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), AbstractC8726f.m14230a(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), AbstractC8726f.m14230a(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), AbstractC8726f.m14230a(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), AbstractC8726f.m14230a(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), AbstractC8726f.m14230a(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), AbstractC8726f.m14230a(AutofillType.PhoneNumber, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), AbstractC8726f.m14230a(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), AbstractC8726f.m14230a(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), AbstractC8726f.m14230a(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), AbstractC8726f.m14230a(AutofillType.Gender, HintConstants.AUTOFILL_HINT_GENDER), AbstractC8726f.m14230a(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), AbstractC8726f.m14230a(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), AbstractC8726f.m14230a(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), AbstractC8726f.m14230a(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), AbstractC8726f.m14230a(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP));

    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    public static final String getAndroidType(AutofillType autofillType) {
        String str = androidAutofillTypes.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }

    public static /* synthetic */ void getAndroidType$annotations(AutofillType autofillType) {
    }
}
