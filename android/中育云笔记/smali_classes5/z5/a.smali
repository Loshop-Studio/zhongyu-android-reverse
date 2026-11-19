.class public abstract Lz5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz5/a;->a:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Boolean;)Ljavax/crypto/SecretKey;
    .locals 5

    .line 1
    const-string v0, "AndroidKeyStore"

    .line 2
    .line 3
    const-string v1, "load key"

    .line 4
    .line 5
    const-string v2, "GCMKS"

    .line 6
    .line 7
    invoke-static {v2, v1}, La6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, v3}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0, v3}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v4, v1, Ljavax/crypto/SecretKey;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    check-cast v1, Ljavax/crypto/SecretKey;

    .line 27
    .line 28
    return-object v1

    .line 29
    :catch_0
    move-exception p0

    .line 30
    goto :goto_0

    .line 31
    :catch_1
    move-exception p0

    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :catch_2
    move-exception p0

    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :catch_3
    move-exception p0

    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :catch_4
    move-exception p0

    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :catch_5
    move-exception p0

    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :catch_6
    move-exception p0

    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :catch_7
    move-exception p0

    .line 50
    goto/16 :goto_7

    .line 51
    .line 52
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    const-string p1, "generate key"

    .line 59
    .line 60
    invoke-static {v2, p1}, La6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string p1, "AES"

    .line 64
    .line 65
    invoke-static {p1, v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 70
    .line 71
    const/4 v1, 0x3

    .line 72
    invoke-direct {v0, p0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    const-string p0, "GCM"

    .line 76
    .line 77
    filled-new-array {p0}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v0, p0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string v0, "NoPadding"

    .line 86
    .line 87
    filled-new-array {v0}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0, v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const/16 v0, 0x100

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p1, p0}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    .line 109
    .line 110
    .line 111
    move-result-object p0
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/UnrecoverableKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    return-object p0

    .line 113
    :cond_1
    return-object v3

    .line 114
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v0, "Exception: "

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 139
    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v1, "Exception : "

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v0, "NoSuchProviderException : "

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 190
    .line 191
    new-instance v1, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p1

    .line 214
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v0, "InvalidAlgorithmParameterException : "

    .line 220
    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 239
    .line 240
    new-instance v1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw p1

    .line 263
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    const-string v0, "UnrecoverableKeyException : "

    .line 269
    .line 270
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 288
    .line 289
    new-instance v1, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p1

    .line 312
    :goto_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 315
    .line 316
    .line 317
    const-string v0, "NoSuchAlgorithmException : "

    .line 318
    .line 319
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 337
    .line 338
    new-instance v1, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw p1

    .line 361
    :goto_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    const-string v0, "CertificateException : "

    .line 367
    .line 368
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 386
    .line 387
    new-instance v1, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw p1

    .line 410
    :goto_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 413
    .line 414
    .line 415
    const-string v0, "IOException : "

    .line 416
    .line 417
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 435
    .line 436
    new-instance v1, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw p1

    .line 459
    :goto_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    const-string v0, "KeyStoreException : "

    .line 465
    .line 466
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    invoke-static {v2, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 484
    .line 485
    new-instance v1, Ljava/lang/StringBuilder;

    .line 486
    .line 487
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw p1
.end method

.method public static b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public static c(Ljavax/crypto/SecretKey;[B)[B
    .locals 6

    .line 1
    const-string v0, "GCMKS"

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    :try_start_0
    const-string v3, "AES/GCM/NoPadding"

    .line 10
    .line 11
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    new-instance v4, Ljavax/crypto/spec/GCMParameterSpec;

    .line 16
    .line 17
    const/16 v5, 0x80

    .line 18
    .line 19
    invoke-direct {v4, v5, v2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-virtual {v3, v2, p0, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 24
    .line 25
    .line 26
    array-length p0, p1

    .line 27
    sub-int/2addr p0, v1

    .line 28
    invoke-virtual {v3, p1, v1, p0}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-object p0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    goto :goto_0

    .line 35
    :catch_1
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :catch_2
    move-exception p0

    .line 38
    goto :goto_2

    .line 39
    :catch_3
    move-exception p0

    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :catch_4
    move-exception p0

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :catch_5
    move-exception p0

    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :catch_6
    move-exception p0

    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v1, "Exception: "

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 76
    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v1, "BadPaddingException : "

    .line 106
    .line 107
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v1, "IllegalBlockSizeException : "

    .line 155
    .line 156
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 174
    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    const-string v1, "InvalidAlgorithmParameterException : "

    .line 204
    .line 205
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 223
    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :goto_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const-string v1, "InvalidKeyException : "

    .line 253
    .line 254
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 272
    .line 273
    new-instance v0, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw p1

    .line 296
    :goto_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    const-string v1, "NoSuchPaddingException : "

    .line 302
    .line 303
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 321
    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw p1

    .line 345
    :goto_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    const-string v1, "NoSuchAlgorithmException : "

    .line 351
    .line 352
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 370
    .line 371
    new-instance v0, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw p1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Boolean;)Ljavax/crypto/SecretKey;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    sget-object v0, Lz5/a;->a:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljavax/crypto/SecretKey;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    const-class v0, Lz5/a;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    sget-object v1, Lz5/a;->a:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljavax/crypto/SecretKey;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-static {p0, p1}, Lz5/a;->a(Ljava/lang/String;Ljava/lang/Boolean;)Ljavax/crypto/SecretKey;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    sget-object v1, Lz5/a;->a:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v1, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    new-instance p0, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 45
    .line 46
    const-string p1, "AES GCM is decrypt,but alias is null"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_1
    :goto_0
    monitor-exit v0

    .line 53
    goto :goto_2

    .line 54
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw p0

    .line 56
    :cond_2
    :goto_2
    sget-object p1, Lz5/a;->a:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljavax/crypto/SecretKey;

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    new-instance p0, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 66
    .line 67
    const-string p1, "alias is null"

    .line 68
    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
.end method

.method public static e(Ljavax/crypto/SecretKey;[B)[B
    .locals 5

    .line 1
    const-string v0, "GCMKS"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [B

    .line 5
    .line 6
    :try_start_0
    const-string v3, "AES/GCM/NoPadding"

    .line 7
    .line 8
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v4, 0x1

    .line 13
    invoke-virtual {v3, v4, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v3}, Ljavax/crypto/Cipher;->getIV()[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    array-length v3, p1

    .line 27
    const/16 v4, 0xc

    .line 28
    .line 29
    if-eq v3, v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    array-length v2, p1

    .line 33
    array-length v3, p0

    .line 34
    add-int/2addr v2, v3

    .line 35
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    array-length p1, p1

    .line 40
    array-length v3, p0

    .line 41
    invoke-static {p0, v1, v2, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :catch_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :catch_2
    move-exception p0

    .line 50
    goto :goto_3

    .line 51
    :catch_3
    move-exception p0

    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :catch_4
    move-exception p0

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catch_5
    move-exception p0

    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_1
    :goto_0
    const-string p0, "IV is invalid."

    .line 61
    .line 62
    invoke-static {v0, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v1, "Exception: "

    .line 72
    .line 73
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 91
    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v1, "Exception : "

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v1, "InvalidKeyException : "

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 142
    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v1, "IllegalBlockSizeException : "

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 191
    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p1

    .line 215
    :goto_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const-string v1, "BadPaddingException : "

    .line 221
    .line 222
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 240
    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw p1

    .line 264
    :goto_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const-string v1, "NoSuchPaddingException : "

    .line 270
    .line 271
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 289
    .line 290
    new-instance v0, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw p1

    .line 313
    :goto_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    const-string v1, "NoSuchAlgorithmException : "

    .line 319
    .line 320
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-static {v0, p1}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    new-instance p1, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;

    .line 338
    .line 339
    new-instance v0, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-direct {p1, p0}, Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw p1
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const-string v2, "GCMKS"

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, La6/d;->b(Ljava/lang/String;)[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0, p1}, Lz5/a;->g(Ljava/lang/String;[B)[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "UTF-8"

    .line 29
    .line 30
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v0, "decrypt: UnsupportedEncodingException : "

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_1
    :goto_0
    const-string p0, "alias or encrypt content is null"

    .line 61
    .line 62
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method

.method public static g(Ljava/lang/String;[B)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const-string v2, "GCMKS"

    .line 9
    .line 10
    if-nez v1, :cond_4

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {}, Lz5/a;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string p0, "sdk version is too low"

    .line 22
    .line 23
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    array-length v1, p1

    .line 28
    const/16 v3, 0xc

    .line 29
    .line 30
    if-gt v1, v3, :cond_2

    .line 31
    .line 32
    const-string p0, "Decrypt source data is invalid."

    .line 33
    .line 34
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :try_start_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-static {p0, v1}, Lz5/a;->d(Ljava/lang/String;Ljava/lang/Boolean;)Ljavax/crypto/SecretKey;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_0
    .catch Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v3, "e : "

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    :goto_0
    if-nez p0, :cond_3

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_3
    invoke-static {p0, p1}, Lz5/a;->h(Ljavax/crypto/SecretKey;[B)[B

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_4
    :goto_1
    const-string p0, "alias or encrypt content is null"

    .line 80
    .line 81
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public static h(Ljavax/crypto/SecretKey;[B)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const-string v1, "GCMKS"

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, "Decrypt secret key is null"

    .line 9
    .line 10
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const-string p0, "content is null"

    .line 17
    .line 18
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    invoke-static {}, Lz5/a;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    const-string p0, "sdk version is too low"

    .line 29
    .line 30
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    array-length v2, p1

    .line 35
    const/16 v3, 0xc

    .line 36
    .line 37
    if-gt v2, v3, :cond_3

    .line 38
    .line 39
    const-string p0, "Decrypt source data is invalid."

    .line 40
    .line 41
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    :try_start_0
    invoke-static {p0, p1}, Lz5/a;->c(Ljavax/crypto/SecretKey;[B)[B

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catch Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-object p0

    .line 50
    :catch_0
    move-exception p0

    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v2, "e : "

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const-string v2, "GCMKS"

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    const-string v0, "UTF-8"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0, p1}, Lz5/a;->j(Ljava/lang/String;[B)[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, La6/d;->a([B)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-object p0

    .line 33
    :catch_0
    move-exception p0

    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v0, "encrypt: UnsupportedEncodingException : "

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_1
    :goto_0
    const-string p0, "alias or encrypt content is null"

    .line 60
    .line 61
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method public static j(Ljava/lang/String;[B)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const-string v2, "GCMKS"

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {}, Lz5/a;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string p0, "sdk version is too low"

    .line 22
    .line 23
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    :try_start_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {p0, v1}, Lz5/a;->d(Ljava/lang/String;Ljava/lang/Boolean;)Ljavax/crypto/SecretKey;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catch Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p0

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "e : "

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    :goto_0
    if-nez p0, :cond_2

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    invoke-static {p0, p1}, Lz5/a;->k(Ljavax/crypto/SecretKey;[B)[B

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_3
    :goto_1
    const-string p0, "alias or encrypt content is null"

    .line 69
    .line 70
    invoke-static {v2, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public static k(Ljavax/crypto/SecretKey;[B)[B
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const-string v1, "GCMKS"

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p0, "content is null"

    .line 9
    .line 10
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, "secret key is null"

    .line 17
    .line 18
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    invoke-static {}, Lz5/a;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    const-string p0, "sdk version is too low"

    .line 29
    .line 30
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    :try_start_0
    invoke-static {p0, p1}, Lz5/a;->e(Ljavax/crypto/SecretKey;[B)[B

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catch Lcom/huawei/secure/android/common/encrypt/keystore/aes/AesKsParamException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-object p0

    .line 39
    :catch_0
    move-exception p0

    .line 40
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "e : "

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {v1, p0}, La6/g;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v0
.end method
