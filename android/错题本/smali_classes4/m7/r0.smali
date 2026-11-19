.class public final Lm7/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# instance fields
.field public final a:Li7/b;

.field public final b:Li7/b;

.field public final synthetic c:I

.field public final d:Lk7/h;


# direct methods
.method public constructor <init>(Li7/b;Li7/b;B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm7/r0;->a:Li7/b;

    .line 3
    iput-object p2, p0, Lm7/r0;->b:Li7/b;

    return-void
.end method

.method public constructor <init>(Li7/b;Li7/b;I)V
    .locals 3

    iput p3, p0, Lm7/r0;->c:I

    packed-switch p3, :pswitch_data_0

    const/4 p3, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lm7/r0;-><init>(Li7/b;Li7/b;B)V

    .line 5
    sget-object p3, Lk7/l;->d:Lk7/l;

    const/4 v0, 0x0

    new-array v0, v0, [Lk7/g;

    new-instance v1, Lm7/p0;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lm7/p0;-><init>(Li7/b;Li7/b;I)V

    const-string p1, "kotlin.collections.Map.Entry"

    invoke-static {p1, p3, v0, v1}, La/a;->g(Ljava/lang/String;Lcoil3/network/g;[Lk7/g;Lr6/c;)Lk7/h;

    move-result-object p1

    iput-object p1, p0, Lm7/r0;->d:Lk7/h;

    return-void

    :pswitch_0
    const/4 p3, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lm7/r0;-><init>(Li7/b;Li7/b;B)V

    .line 7
    new-array p3, p3, [Lk7/g;

    new-instance v0, Lm7/p0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lm7/p0;-><init>(Li7/b;Li7/b;I)V

    const-string p1, "kotlin.Pair"

    invoke-static {p1, p3, v0}, La/a;->e(Ljava/lang/String;[Lk7/g;Lr6/c;)Lk7/h;

    move-result-object p1

    iput-object p1, p0, Lm7/r0;->d:Lk7/h;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm7/r0;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/Pair;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lm7/q0;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2}, Lm7/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lm7/y0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "decoder"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {p1, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ll7/c;->decodeSequentially()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    iget-object v6, p0, Lm7/r0;->b:Li7/b;

    .line 24
    .line 25
    iget-object v7, p0, Lm7/r0;->a:Li7/b;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v7, Li7/a;

    .line 34
    .line 35
    invoke-interface {p1, v0, v3, v7, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v6, Li7/a;

    .line 44
    .line 45
    invoke-interface {p1, v2, v4, v6, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p0, v0, v2}, Lm7/r0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    move-object v2, v0

    .line 55
    move-object v8, v2

    .line 56
    :goto_0
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-interface {p1, v9}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    const/4 v10, -0x1

    .line 65
    if-eq v9, v10, :cond_3

    .line 66
    .line 67
    if-eqz v9, :cond_2

    .line 68
    .line 69
    if-ne v9, v4, :cond_1

    .line 70
    .line 71
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    move-object v9, v6

    .line 76
    check-cast v9, Li7/a;

    .line 77
    .line 78
    invoke-interface {p1, v8, v4, v9, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 84
    .line 85
    const-string v0, "Invalid index: "

    .line 86
    .line 87
    invoke-static {v9, v0}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_2
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    move-object v9, v7

    .line 100
    check-cast v9, Li7/a;

    .line 101
    .line 102
    invoke-interface {p1, v2, v3, v9, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    if-eq v2, v0, :cond_5

    .line 108
    .line 109
    if-eq v8, v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {p0, v2, v8}, Lm7/r0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_1
    invoke-interface {p1, v1}, Ll7/c;->endStructure(Lk7/g;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 120
    .line 121
    const-string v0, "Element \'value\' is missing"

    .line 122
    .line 123
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1

    .line 127
    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 128
    .line 129
    const-string v0, "Element \'key\' is missing"

    .line 130
    .line 131
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    iget v0, p0, Lm7/r0;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm7/r0;->d:Lk7/h;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lm7/r0;->d:Lk7/h;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lm7/r0;->a:Li7/b;

    .line 14
    .line 15
    check-cast v1, Li7/e;

    .line 16
    .line 17
    iget v2, p0, Lm7/r0;->c:I

    .line 18
    .line 19
    packed-switch v2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v2, p2

    .line 23
    check-cast v2, Lkotlin/Pair;

    .line 24
    .line 25
    const-string v3, "<this>"

    .line 26
    .line 27
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_0

    .line 35
    :pswitch_0
    move-object v2, p2

    .line 36
    check-cast v2, Ljava/util/Map$Entry;

    .line 37
    .line 38
    const-string v3, "<this>"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_0
    const/4 v3, 0x0

    .line 48
    invoke-interface {p1, v0, v3, v1, v2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v1, p0, Lm7/r0;->b:Li7/b;

    .line 56
    .line 57
    check-cast v1, Li7/e;

    .line 58
    .line 59
    iget v2, p0, Lm7/r0;->c:I

    .line 60
    .line 61
    packed-switch v2, :pswitch_data_1

    .line 62
    .line 63
    .line 64
    check-cast p2, Lkotlin/Pair;

    .line 65
    .line 66
    const-string v2, "<this>"

    .line 67
    .line 68
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    goto :goto_1

    .line 76
    :pswitch_1
    check-cast p2, Ljava/util/Map$Entry;

    .line 77
    .line 78
    const-string v2, "<this>"

    .line 79
    .line 80
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    :goto_1
    const/4 v2, 0x1

    .line 88
    invoke-interface {p1, v0, v2, v1, p2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p0}, Li7/e;->getDescriptor()Lk7/g;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-interface {p1, p2}, Ll7/d;->endStructure(Lk7/g;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
