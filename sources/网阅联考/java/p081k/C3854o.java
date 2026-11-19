package p081k;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: k.o */
/* loaded from: classes2.dex */
public class C3854o extends AbstractC3851l {

    /* renamed from: d */
    public static final UriMatcher f4763d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f4763d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C3854o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p081k.InterfaceC3843d
    /* renamed from: a */
    public Class mo5114a() {
        return InputStream.class;
    }

    @Override // p081k.AbstractC3851l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo5115c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p081k.AbstractC3851l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo5116e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM5153i = m5153i(uri, contentResolver);
        if (inputStreamM5153i != null) {
            return inputStreamM5153i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream m5153i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f4763d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m5154j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m5154j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream m5154j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
