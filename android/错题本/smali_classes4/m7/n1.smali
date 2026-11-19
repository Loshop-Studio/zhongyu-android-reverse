.class public final Lm7/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# instance fields
.field public final a:Li7/b;

.field public final b:Li7/b;

.field public final c:Li7/b;

.field public final d:Lk7/h;


# direct methods
.method public constructor <init>(Li7/b;Li7/b;Li7/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm7/n1;->a:Li7/b;

    .line 5
    .line 6
    iput-object p2, p0, Lm7/n1;->b:Li7/b;

    .line 7
    .line 8
    iput-object p3, p0, Lm7/n1;->c:Li7/b;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    new-array p1, p1, [Lk7/g;

    .line 12
    .line 13
    new-instance p2, Landroidx/navigation/i;

    .line 14
    .line 15
    const/16 p3, 0x1b

    .line 16
    .line 17
    invoke-direct {p2, p0, p3}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    const-string p3, "kotlin.Triple"

    .line 21
    .line 22
    invoke-static {p3, p1, p2}, La/a;->e(Ljava/lang/String;[Lk7/g;Lr6/c;)Lk7/h;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lm7/n1;->d:Lk7/h;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 14

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm7/n1;->d:Lk7/h;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ll7/c;->decodeSequentially()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    iget-object v6, p0, Lm7/n1;->c:Li7/b;

    .line 21
    .line 22
    iget-object v7, p0, Lm7/n1;->b:Li7/b;

    .line 23
    .line 24
    iget-object v8, p0, Lm7/n1;->a:Li7/b;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v8, Li7/a;

    .line 29
    .line 30
    invoke-interface {p1, v0, v2, v8, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v7, Li7/a;

    .line 35
    .line 36
    invoke-interface {p1, v0, v4, v7, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v6, Li7/a;

    .line 41
    .line 42
    invoke-interface {p1, v0, v3, v6, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {p1, v0}, Ll7/c;->endStructure(Lk7/g;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lkotlin/Triple;

    .line 50
    .line 51
    invoke-direct {p1, v1, v2, v3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_0
    sget-object v1, Lm7/y0;->c:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v9, v1

    .line 58
    move-object v10, v9

    .line 59
    move-object v11, v10

    .line 60
    :goto_0
    invoke-interface {p1, v0}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    const/4 v13, -0x1

    .line 65
    if-eq v12, v13, :cond_4

    .line 66
    .line 67
    if-eqz v12, :cond_3

    .line 68
    .line 69
    if-eq v12, v4, :cond_2

    .line 70
    .line 71
    if-ne v12, v3, :cond_1

    .line 72
    .line 73
    move-object v11, v6

    .line 74
    check-cast v11, Li7/a;

    .line 75
    .line 76
    invoke-interface {p1, v0, v3, v11, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 82
    .line 83
    const-string v0, "Unexpected index "

    .line 84
    .line 85
    invoke-static {v12, v0}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_2
    move-object v10, v7

    .line 94
    check-cast v10, Li7/a;

    .line 95
    .line 96
    invoke-interface {p1, v0, v4, v10, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    goto :goto_0

    .line 101
    :cond_3
    move-object v9, v8

    .line 102
    check-cast v9, Li7/a;

    .line 103
    .line 104
    invoke-interface {p1, v0, v2, v9, v5}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    goto :goto_0

    .line 109
    :cond_4
    invoke-interface {p1, v0}, Ll7/c;->endStructure(Lk7/g;)V

    .line 110
    .line 111
    .line 112
    if-eq v9, v1, :cond_7

    .line 113
    .line 114
    if-eq v10, v1, :cond_6

    .line 115
    .line 116
    if-eq v11, v1, :cond_5

    .line 117
    .line 118
    new-instance p1, Lkotlin/Triple;

    .line 119
    .line 120
    invoke-direct {p1, v9, v10, v11}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 125
    .line 126
    const-string v0, "Element \'third\' is missing"

    .line 127
    .line 128
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :cond_6
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 133
    .line 134
    const-string v0, "Element \'second\' is missing"

    .line 135
    .line 136
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_7
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 141
    .line 142
    const-string v0, "Element \'first\' is missing"

    .line 143
    .line 144
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/n1;->d:Lk7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lkotlin/Triple;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm7/n1;->d:Lk7/h;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, Lm7/n1;->a:Li7/b;

    .line 15
    .line 16
    check-cast v1, Li7/e;

    .line 17
    .line 18
    invoke-virtual {p2}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-interface {p1, v0, v3, v1, v2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lm7/n1;->b:Li7/b;

    .line 27
    .line 28
    check-cast v1, Li7/e;

    .line 29
    .line 30
    invoke-virtual {p2}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-interface {p1, v0, v3, v1, v2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lm7/n1;->c:Li7/b;

    .line 39
    .line 40
    check-cast v1, Li7/e;

    .line 41
    .line 42
    invoke-virtual {p2}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const/4 v2, 0x2

    .line 47
    invoke-interface {p1, v0, v2, v1, p2}, Ll7/d;->encodeSerializableElement(Lk7/g;ILi7/e;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0}, Ll7/d;->endStructure(Lk7/g;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
