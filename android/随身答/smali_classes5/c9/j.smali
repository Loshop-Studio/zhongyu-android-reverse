.class public abstract Lc9/j;
.super Lc9/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc9/j$a;,
        Lc9/j$c;,
        Lc9/j$b;
    }
.end annotation


# instance fields
.field public final a:Lc9/w;

.field public final b:Ll8/e$a;

.field public final c:Lc9/f;


# direct methods
.method public constructor <init>(Lc9/w;Ll8/e$a;Lc9/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc9/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/j;->a:Lc9/w;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/j;->b:Ll8/e$a;

    .line 7
    .line 8
    iput-object p3, p0, Lc9/j;->c:Lc9/f;

    .line 9
    .line 10
    return-void
.end method

.method public static d(Lc9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lc9/c;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lc9/y;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lc9/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const-string p3, "Unable to create call adapter for %s"

    .line 8
    .line 9
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p1, p0, p3, p2}, Lc9/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    throw p0
.end method

.method public static e(Lc9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)Lc9/f;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, p2, v0}, Lc9/y;->h(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lc9/f;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    const-string v0, "Unable to create converter for %s"

    .line 12
    .line 13
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p0, v0, p2}, Lc9/c0;->n(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    throw p0
.end method

.method public static f(Lc9/y;Ljava/lang/reflect/Method;Lc9/w;)Lc9/j;
    .locals 12

    .line 1
    iget-boolean v3, p2, Lc9/w;->k:Z

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    const-class v5, Lc9/x;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    if-eqz v3, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    array-length v8, v7

    .line 17
    const/4 v9, 0x1

    .line 18
    sub-int/2addr v8, v9

    .line 19
    aget-object v7, v7, v8

    .line 20
    .line 21
    check-cast v7, Ljava/lang/reflect/ParameterizedType;

    .line 22
    .line 23
    invoke-static {v6, v7}, Lc9/c0;->f(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-static {v7}, Lc9/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    if-ne v8, v5, :cond_0

    .line 32
    .line 33
    instance-of v8, v7, Ljava/lang/reflect/ParameterizedType;

    .line 34
    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    check-cast v7, Ljava/lang/reflect/ParameterizedType;

    .line 38
    .line 39
    invoke-static {v6, v7}, Lc9/c0;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    move v8, v9

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v8, v6

    .line 46
    :goto_0
    new-instance v10, Lc9/c0$b;

    .line 47
    .line 48
    new-array v9, v9, [Ljava/lang/reflect/Type;

    .line 49
    .line 50
    aput-object v7, v9, v6

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    const-class v11, Lc9/b;

    .line 54
    .line 55
    invoke-direct {v10, v7, v11, v9}, Lc9/c0$b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v4}, Lc9/b0;->a([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    move v8, v6

    .line 68
    :goto_1
    invoke-static {p0, p1, v10, v4}, Lc9/j;->d(Lc9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lc9/c;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {v4}, Lc9/c;->a()Ljava/lang/reflect/Type;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    const-class v9, Ll8/y;

    .line 77
    .line 78
    if-eq v7, v9, :cond_7

    .line 79
    .line 80
    if-eq v7, v5, :cond_6

    .line 81
    .line 82
    iget-object v5, p2, Lc9/w;->c:Ljava/lang/String;

    .line 83
    .line 84
    const-string v9, "HEAD"

    .line 85
    .line 86
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    const-class v5, Ljava/lang/Void;

    .line 93
    .line 94
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    :cond_2
    move v5, v3

    .line 101
    goto :goto_2

    .line 102
    :cond_3
    const-string v0, "HEAD method must use Void as response type."

    .line 103
    .line 104
    new-array v2, v6, [Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {p1, v0, v2}, Lc9/c0;->m(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    throw v0

    .line 111
    :goto_2
    invoke-static {p0, p1, v7}, Lc9/j;->e(Lc9/y;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)Lc9/f;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    iget-object v0, p0, Lc9/y;->b:Ll8/e$a;

    .line 116
    .line 117
    if-nez v5, :cond_4

    .line 118
    .line 119
    new-instance v1, Lc9/j$a;

    .line 120
    .line 121
    invoke-direct {v1, p2, v0, v3, v4}, Lc9/j$a;-><init>(Lc9/w;Ll8/e$a;Lc9/f;Lc9/c;)V

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :cond_4
    if-eqz v8, :cond_5

    .line 126
    .line 127
    new-instance v1, Lc9/j$c;

    .line 128
    .line 129
    invoke-direct {v1, p2, v0, v3, v4}, Lc9/j$c;-><init>(Lc9/w;Ll8/e$a;Lc9/f;Lc9/c;)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_5
    move-object v2, v0

    .line 134
    new-instance v0, Lc9/j$b;

    .line 135
    .line 136
    const/4 v5, 0x0

    .line 137
    move-object v1, p2

    .line 138
    invoke-direct/range {v0 .. v5}, Lc9/j$b;-><init>(Lc9/w;Ll8/e$a;Lc9/f;Lc9/c;Z)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_6
    const-string v0, "Response must include generic type (e.g., Response<String>)"

    .line 143
    .line 144
    new-array v2, v6, [Ljava/lang/Object;

    .line 145
    .line 146
    invoke-static {p1, v0, v2}, Lc9/c0;->m(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    throw v0

    .line 151
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v2, "\'"

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-static {v7}, Lc9/c0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v2, "\' is not a valid response body type. Did you mean ResponseBody?"

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-array v2, v6, [Ljava/lang/Object;

    .line 182
    .line 183
    invoke-static {p1, v0, v2}, Lc9/c0;->m(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    throw v0
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lc9/l;

    .line 2
    .line 3
    iget-object v1, p0, Lc9/j;->a:Lc9/w;

    .line 4
    .line 5
    iget-object v2, p0, Lc9/j;->b:Ll8/e$a;

    .line 6
    .line 7
    iget-object v3, p0, Lc9/j;->c:Lc9/f;

    .line 8
    .line 9
    invoke-direct {v0, v1, p1, v2, v3}, Lc9/l;-><init>(Lc9/w;[Ljava/lang/Object;Ll8/e$a;Lc9/f;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Lc9/j;->c(Lc9/b;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public abstract c(Lc9/b;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
