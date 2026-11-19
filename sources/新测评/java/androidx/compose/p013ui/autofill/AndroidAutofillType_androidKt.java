package androidx.compose.p013ui.autofill;

import androidx.autofill.HintConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\"0\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m13558d2 = {"androidAutofillTypes", "Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidType", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "getAndroidType", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidAutofillType_androidKt {
    private static final HashMap<AutofillType, String> androidAutofillTypes = MapsKt.hashMapOf(TuplesKt.m13565to(AutofillType.EmailAddress, HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS), TuplesKt.m13565to(AutofillType.Username, HintConstants.AUTOFILL_HINT_USERNAME), TuplesKt.m13565to(AutofillType.Password, HintConstants.AUTOFILL_HINT_PASSWORD), TuplesKt.m13565to(AutofillType.NewUsername, HintConstants.AUTOFILL_HINT_NEW_USERNAME), TuplesKt.m13565to(AutofillType.NewPassword, HintConstants.AUTOFILL_HINT_NEW_PASSWORD), TuplesKt.m13565to(AutofillType.PostalAddress, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS), TuplesKt.m13565to(AutofillType.PostalCode, HintConstants.AUTOFILL_HINT_POSTAL_CODE), TuplesKt.m13565to(AutofillType.CreditCardNumber, HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER), TuplesKt.m13565to(AutofillType.CreditCardSecurityCode, HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE), TuplesKt.m13565to(AutofillType.CreditCardExpirationDate, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE), TuplesKt.m13565to(AutofillType.CreditCardExpirationMonth, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH), TuplesKt.m13565to(AutofillType.CreditCardExpirationYear, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR), TuplesKt.m13565to(AutofillType.CreditCardExpirationDay, HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY), TuplesKt.m13565to(AutofillType.AddressCountry, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY), TuplesKt.m13565to(AutofillType.AddressRegion, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION), TuplesKt.m13565to(AutofillType.AddressLocality, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY), TuplesKt.m13565to(AutofillType.AddressStreet, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS), TuplesKt.m13565to(AutofillType.AddressAuxiliaryDetails, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS), TuplesKt.m13565to(AutofillType.PostalCodeExtended, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE), TuplesKt.m13565to(AutofillType.PersonFullName, HintConstants.AUTOFILL_HINT_PERSON_NAME), TuplesKt.m13565to(AutofillType.PersonFirstName, HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN), TuplesKt.m13565to(AutofillType.PersonLastName, HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY), TuplesKt.m13565to(AutofillType.PersonMiddleName, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE), TuplesKt.m13565to(AutofillType.PersonMiddleInitial, HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL), TuplesKt.m13565to(AutofillType.PersonNamePrefix, HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX), TuplesKt.m13565to(AutofillType.PersonNameSuffix, HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX), TuplesKt.m13565to(AutofillType.PhoneNumber, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), TuplesKt.m13565to(AutofillType.PhoneNumberDevice, HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE), TuplesKt.m13565to(AutofillType.PhoneCountryCode, HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE), TuplesKt.m13565to(AutofillType.PhoneNumberNational, HintConstants.AUTOFILL_HINT_PHONE_NATIONAL), TuplesKt.m13565to(AutofillType.Gender, HintConstants.AUTOFILL_HINT_GENDER), TuplesKt.m13565to(AutofillType.BirthDateFull, HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL), TuplesKt.m13565to(AutofillType.BirthDateDay, HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY), TuplesKt.m13565to(AutofillType.BirthDateMonth, HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH), TuplesKt.m13565to(AutofillType.BirthDateYear, HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR), TuplesKt.m13565to(AutofillType.SmsOtpCode, HintConstants.AUTOFILL_HINT_SMS_OTP));

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
