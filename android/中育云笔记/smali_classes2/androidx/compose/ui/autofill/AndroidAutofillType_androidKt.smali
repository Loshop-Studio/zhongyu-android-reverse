.class public final Landroidx/compose/ui/autofill/AndroidAutofillType_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final androidAutofillTypes:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/compose/ui/autofill/AutofillType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 38

    .line 1
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->EmailAddress:Landroidx/compose/ui/autofill/AutofillType;

    .line 2
    .line 3
    const-string v1, "emailAddress"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->Username:Landroidx/compose/ui/autofill/AutofillType;

    .line 10
    .line 11
    const-string/jumbo v1, "username"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->Password:Landroidx/compose/ui/autofill/AutofillType;

    .line 19
    .line 20
    const-string/jumbo v1, "password"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->NewUsername:Landroidx/compose/ui/autofill/AutofillType;

    .line 28
    .line 29
    const-string v1, "newUsername"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->NewPassword:Landroidx/compose/ui/autofill/AutofillType;

    .line 36
    .line 37
    const-string v1, "newPassword"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PostalAddress:Landroidx/compose/ui/autofill/AutofillType;

    .line 44
    .line 45
    const-string/jumbo v1, "postalAddress"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PostalCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 53
    .line 54
    const-string/jumbo v1, "postalCode"

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->CreditCardNumber:Landroidx/compose/ui/autofill/AutofillType;

    .line 62
    .line 63
    const-string v1, "creditCardNumber"

    .line 64
    .line 65
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->CreditCardSecurityCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 70
    .line 71
    const-string v1, "creditCardSecurityCode"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationDate:Landroidx/compose/ui/autofill/AutofillType;

    .line 78
    .line 79
    const-string v1, "creditCardExpirationDate"

    .line 80
    .line 81
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationMonth:Landroidx/compose/ui/autofill/AutofillType;

    .line 86
    .line 87
    const-string v1, "creditCardExpirationMonth"

    .line 88
    .line 89
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationYear:Landroidx/compose/ui/autofill/AutofillType;

    .line 94
    .line 95
    const-string v1, "creditCardExpirationYear"

    .line 96
    .line 97
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->CreditCardExpirationDay:Landroidx/compose/ui/autofill/AutofillType;

    .line 102
    .line 103
    const-string v1, "creditCardExpirationDay"

    .line 104
    .line 105
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->AddressCountry:Landroidx/compose/ui/autofill/AutofillType;

    .line 110
    .line 111
    const-string v1, "addressCountry"

    .line 112
    .line 113
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->AddressRegion:Landroidx/compose/ui/autofill/AutofillType;

    .line 118
    .line 119
    const-string v1, "addressRegion"

    .line 120
    .line 121
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 122
    .line 123
    .line 124
    move-result-object v16

    .line 125
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->AddressLocality:Landroidx/compose/ui/autofill/AutofillType;

    .line 126
    .line 127
    const-string v1, "addressLocality"

    .line 128
    .line 129
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 130
    .line 131
    .line 132
    move-result-object v17

    .line 133
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->AddressStreet:Landroidx/compose/ui/autofill/AutofillType;

    .line 134
    .line 135
    const-string/jumbo v1, "streetAddress"

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 139
    .line 140
    .line 141
    move-result-object v18

    .line 142
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->AddressAuxiliaryDetails:Landroidx/compose/ui/autofill/AutofillType;

    .line 143
    .line 144
    const-string v1, "extendedAddress"

    .line 145
    .line 146
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 147
    .line 148
    .line 149
    move-result-object v19

    .line 150
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PostalCodeExtended:Landroidx/compose/ui/autofill/AutofillType;

    .line 151
    .line 152
    const-string v1, "extendedPostalCode"

    .line 153
    .line 154
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 155
    .line 156
    .line 157
    move-result-object v20

    .line 158
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PersonFullName:Landroidx/compose/ui/autofill/AutofillType;

    .line 159
    .line 160
    const-string/jumbo v1, "personName"

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 164
    .line 165
    .line 166
    move-result-object v21

    .line 167
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PersonFirstName:Landroidx/compose/ui/autofill/AutofillType;

    .line 168
    .line 169
    const-string/jumbo v1, "personGivenName"

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 173
    .line 174
    .line 175
    move-result-object v22

    .line 176
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PersonLastName:Landroidx/compose/ui/autofill/AutofillType;

    .line 177
    .line 178
    const-string/jumbo v1, "personFamilyName"

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 182
    .line 183
    .line 184
    move-result-object v23

    .line 185
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PersonMiddleName:Landroidx/compose/ui/autofill/AutofillType;

    .line 186
    .line 187
    const-string/jumbo v1, "personMiddleName"

    .line 188
    .line 189
    .line 190
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 191
    .line 192
    .line 193
    move-result-object v24

    .line 194
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PersonMiddleInitial:Landroidx/compose/ui/autofill/AutofillType;

    .line 195
    .line 196
    const-string/jumbo v1, "personMiddleInitial"

    .line 197
    .line 198
    .line 199
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 200
    .line 201
    .line 202
    move-result-object v25

    .line 203
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PersonNamePrefix:Landroidx/compose/ui/autofill/AutofillType;

    .line 204
    .line 205
    const-string/jumbo v1, "personNamePrefix"

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 209
    .line 210
    .line 211
    move-result-object v26

    .line 212
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PersonNameSuffix:Landroidx/compose/ui/autofill/AutofillType;

    .line 213
    .line 214
    const-string/jumbo v1, "personNameSuffix"

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 218
    .line 219
    .line 220
    move-result-object v27

    .line 221
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PhoneNumber:Landroidx/compose/ui/autofill/AutofillType;

    .line 222
    .line 223
    const-string/jumbo v1, "phoneNumber"

    .line 224
    .line 225
    .line 226
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 227
    .line 228
    .line 229
    move-result-object v28

    .line 230
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PhoneNumberDevice:Landroidx/compose/ui/autofill/AutofillType;

    .line 231
    .line 232
    const-string/jumbo v1, "phoneNumberDevice"

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 236
    .line 237
    .line 238
    move-result-object v29

    .line 239
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PhoneCountryCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 240
    .line 241
    const-string/jumbo v1, "phoneCountryCode"

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 245
    .line 246
    .line 247
    move-result-object v30

    .line 248
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->PhoneNumberNational:Landroidx/compose/ui/autofill/AutofillType;

    .line 249
    .line 250
    const-string/jumbo v1, "phoneNational"

    .line 251
    .line 252
    .line 253
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 254
    .line 255
    .line 256
    move-result-object v31

    .line 257
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->Gender:Landroidx/compose/ui/autofill/AutofillType;

    .line 258
    .line 259
    const-string v1, "gender"

    .line 260
    .line 261
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 262
    .line 263
    .line 264
    move-result-object v32

    .line 265
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->BirthDateFull:Landroidx/compose/ui/autofill/AutofillType;

    .line 266
    .line 267
    const-string v1, "birthDateFull"

    .line 268
    .line 269
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 270
    .line 271
    .line 272
    move-result-object v33

    .line 273
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->BirthDateDay:Landroidx/compose/ui/autofill/AutofillType;

    .line 274
    .line 275
    const-string v1, "birthDateDay"

    .line 276
    .line 277
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 278
    .line 279
    .line 280
    move-result-object v34

    .line 281
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->BirthDateMonth:Landroidx/compose/ui/autofill/AutofillType;

    .line 282
    .line 283
    const-string v1, "birthDateMonth"

    .line 284
    .line 285
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 286
    .line 287
    .line 288
    move-result-object v35

    .line 289
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->BirthDateYear:Landroidx/compose/ui/autofill/AutofillType;

    .line 290
    .line 291
    const-string v1, "birthDateYear"

    .line 292
    .line 293
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 294
    .line 295
    .line 296
    move-result-object v36

    .line 297
    sget-object v0, Landroidx/compose/ui/autofill/AutofillType;->SmsOtpCode:Landroidx/compose/ui/autofill/AutofillType;

    .line 298
    .line 299
    const-string/jumbo v1, "smsOTPCode"

    .line 300
    .line 301
    .line 302
    invoke-static {v0, v1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 303
    .line 304
    .line 305
    move-result-object v37

    .line 306
    filled-new-array/range {v2 .. v37}, [Lkotlin/Pair;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v0}, Lkotlin/collections/a;->j([Lkotlin/Pair;)Ljava/util/HashMap;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    sput-object v0, Landroidx/compose/ui/autofill/AndroidAutofillType_androidKt;->androidAutofillTypes:Ljava/util/HashMap;

    .line 315
    .line 316
    return-void
.end method

.method private static synthetic getAndroidAutofillTypes$annotations()V
    .locals 0

    return-void
.end method

.method public static final getAndroidType(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/autofill/AndroidAutofillType_androidKt;->androidAutofillTypes:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Unsupported autofill type"

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static synthetic getAndroidType$annotations(Landroidx/compose/ui/autofill/AutofillType;)V
    .locals 0

    return-void
.end method
