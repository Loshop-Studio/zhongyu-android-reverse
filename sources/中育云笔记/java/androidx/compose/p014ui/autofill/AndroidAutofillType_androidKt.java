package androidx.compose.p014ui.autofill;

import androidx.autofill.HintConstants;
import java.util.HashMap;
import kotlin.collections.AbstractC9925a;
import p309qc.AbstractC10776g;

/* loaded from: classes2.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes = AbstractC9925a.m20090j(AbstractC10776g.m22975a(AutofillType.EmailAddress, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), AbstractC10776g.m22975a(AutofillType.Username, HintConstants.AUTOFILL_HINT_USERNAME), AbstractC10776g.m22975a(AutofillType.Password, HintConstants.AUTOFILL_HINT_PASSWORD), AbstractC10776g.m22975a(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), AbstractC10776g.m22975a(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), AbstractC10776g.m22975a(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), AbstractC10776g.m22975a(AutofillType.PostalCode, HintConstants.AUTOFILL_HINT_POSTAL_CODE), AbstractC10776g.m22975a(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), AbstractC10776g.m22975a(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), AbstractC10776g.m22975a(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), AbstractC10776g.m22975a(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), AbstractC10776g.m22975a(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), AbstractC10776g.m22975a(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), AbstractC10776g.m22975a(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), AbstractC10776g.m22975a(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), AbstractC10776g.m22975a(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), AbstractC10776g.m22975a(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), AbstractC10776g.m22975a(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), AbstractC10776g.m22975a(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), AbstractC10776g.m22975a(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), AbstractC10776g.m22975a(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), AbstractC10776g.m22975a(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), AbstractC10776g.m22975a(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), AbstractC10776g.m22975a(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), AbstractC10776g.m22975a(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), AbstractC10776g.m22975a(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), AbstractC10776g.m22975a(AutofillType.PhoneNumber, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), AbstractC10776g.m22975a(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), AbstractC10776g.m22975a(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), AbstractC10776g.m22975a(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), AbstractC10776g.m22975a(AutofillType.Gender, HintConstants.AUTOFILL_HINT_GENDER), AbstractC10776g.m22975a(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), AbstractC10776g.m22975a(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), AbstractC10776g.m22975a(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), AbstractC10776g.m22975a(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), AbstractC10776g.m22975a(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP));

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
