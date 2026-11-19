.class public abstract Lr6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)Ljava/util/Locale;
    .locals 2

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    sget-object p0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    new-instance p0, Ljava/util/Locale;

    .line 8
    .line 9
    const-string v0, "ru"

    .line 10
    .line 11
    const-string v1, "rRU"

    .line 12
    .line 13
    invoke-direct {p0, v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_1
    new-instance p0, Ljava/util/Locale;

    .line 18
    .line 19
    const-string v0, "ar"

    .line 20
    .line 21
    const-string v1, "AE"

    .line 22
    .line 23
    invoke-direct {p0, v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_2
    new-instance p0, Ljava/util/Locale;

    .line 28
    .line 29
    const-string v0, "pt"

    .line 30
    .line 31
    const-string v1, "PT"

    .line 32
    .line 33
    invoke-direct {p0, v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_3
    new-instance p0, Ljava/util/Locale;

    .line 38
    .line 39
    const-string v0, "es"

    .line 40
    .line 41
    const-string v1, "ES"

    .line 42
    .line 43
    invoke-direct {p0, v0, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_4
    new-instance p0, Ljava/util/Locale;

    .line 48
    .line 49
    const-string v0, "vi"

    .line 50
    .line 51
    invoke-direct {p0, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_5
    sget-object p0, Ljava/util/Locale;->JAPAN:Ljava/util/Locale;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_6
    sget-object p0, Ljava/util/Locale;->FRANCE:Ljava/util/Locale;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_7
    sget-object p0, Ljava/util/Locale;->GERMANY:Ljava/util/Locale;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_8
    sget-object p0, Ljava/util/Locale;->KOREA:Ljava/util/Locale;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_9
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_a
    sget-object p0, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
