.class public abstract Lretrofit2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lretrofit2/m0;

.field public final b:Lokhttp3/d;

.field public final c:Lretrofit2/m;


# direct methods
.method public constructor <init>(Lretrofit2/m0;Lokhttp3/d;Lretrofit2/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/r;->a:Lretrofit2/m0;

    .line 5
    .line 6
    iput-object p2, p0, Lretrofit2/r;->b:Lokhttp3/d;

    .line 7
    .line 8
    iput-object p3, p0, Lretrofit2/r;->c:Lretrofit2/m;

    .line 9
    .line 10
    return-void
.end method

.method public static b(Lretrofit2/p0;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lretrofit2/r;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 1
    new-instance v2, Lretrofit2/l0;

    move-object/from16 v3, p1

    invoke-direct {v2, v0, v3, v1}, Lretrofit2/l0;-><init>(Lretrofit2/p0;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    iget-object v3, v2, Lretrofit2/l0;->d:[Ljava/lang/annotation/Annotation;

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x2

    const-string v8, "HEAD"

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-ge v6, v4, :cond_12

    aget-object v11, v3, v6

    .line 3
    instance-of v12, v11, Lretrofit2/http/DELETE;

    if-eqz v12, :cond_0

    .line 4
    check-cast v11, Lretrofit2/http/DELETE;

    invoke-interface {v11}, Lretrofit2/http/DELETE;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "DELETE"

    invoke-virtual {v2, v8, v7, v5}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 5
    :cond_0
    instance-of v12, v11, Lretrofit2/http/GET;

    if-eqz v12, :cond_1

    .line 6
    check-cast v11, Lretrofit2/http/GET;

    invoke-interface {v11}, Lretrofit2/http/GET;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "GET"

    invoke-virtual {v2, v8, v7, v5}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 7
    :cond_1
    instance-of v12, v11, Lretrofit2/http/HEAD;

    if-eqz v12, :cond_2

    .line 8
    check-cast v11, Lretrofit2/http/HEAD;

    invoke-interface {v11}, Lretrofit2/http/HEAD;->value()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v8, v7, v5}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 9
    :cond_2
    instance-of v8, v11, Lretrofit2/http/PATCH;

    if-eqz v8, :cond_3

    .line 10
    check-cast v11, Lretrofit2/http/PATCH;

    invoke-interface {v11}, Lretrofit2/http/PATCH;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "PATCH"

    invoke-virtual {v2, v8, v7, v9}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 11
    :cond_3
    instance-of v8, v11, Lretrofit2/http/POST;

    if-eqz v8, :cond_4

    .line 12
    check-cast v11, Lretrofit2/http/POST;

    invoke-interface {v11}, Lretrofit2/http/POST;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "POST"

    invoke-virtual {v2, v8, v7, v9}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 13
    :cond_4
    instance-of v8, v11, Lretrofit2/http/PUT;

    if-eqz v8, :cond_5

    .line 14
    check-cast v11, Lretrofit2/http/PUT;

    invoke-interface {v11}, Lretrofit2/http/PUT;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "PUT"

    invoke-virtual {v2, v8, v7, v9}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 15
    :cond_5
    instance-of v8, v11, Lretrofit2/http/OPTIONS;

    if-eqz v8, :cond_6

    .line 16
    check-cast v11, Lretrofit2/http/OPTIONS;

    invoke-interface {v11}, Lretrofit2/http/OPTIONS;->value()Ljava/lang/String;

    move-result-object v7

    const-string v8, "OPTIONS"

    invoke-virtual {v2, v8, v7, v5}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 17
    :cond_6
    instance-of v8, v11, Lretrofit2/http/HTTP;

    if-eqz v8, :cond_7

    .line 18
    check-cast v11, Lretrofit2/http/HTTP;

    .line 19
    invoke-interface {v11}, Lretrofit2/http/HTTP;->method()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v11}, Lretrofit2/http/HTTP;->path()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v11}, Lretrofit2/http/HTTP;->hasBody()Z

    move-result v9

    invoke-virtual {v2, v7, v8, v9}, Lretrofit2/l0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_3

    .line 20
    :cond_7
    instance-of v8, v11, Lretrofit2/http/Headers;

    if-eqz v8, :cond_d

    .line 21
    check-cast v11, Lretrofit2/http/Headers;

    .line 22
    invoke-interface {v11}, Lretrofit2/http/Headers;->value()[Ljava/lang/String;

    move-result-object v8

    .line 23
    array-length v12, v8

    if-eqz v12, :cond_c

    .line 24
    invoke-interface {v11}, Lretrofit2/http/Headers;->allowUnsafeNonAsciiValues()Z

    move-result v11

    .line 25
    new-instance v12, Lkotlin/jvm/internal/o;

    invoke-direct {v12, v7, v5}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 26
    array-length v7, v8

    move v13, v5

    :goto_1
    if-ge v13, v7, :cond_b

    aget-object v14, v8, v13

    const/16 v15, 0x3a

    .line 27
    invoke-virtual {v14, v15}, Ljava/lang/String;->indexOf(I)I

    move-result v15

    move/from16 p1, v9

    const/4 v9, -0x1

    if-eq v15, v9, :cond_a

    if-eqz v15, :cond_a

    .line 28
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    if-eq v15, v9, :cond_a

    .line 29
    invoke-virtual {v14, v5, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v15, v15, 0x1

    .line 30
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    .line 31
    const-string v15, "Content-Type"

    invoke-virtual {v15, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_8

    .line 32
    :try_start_0
    sget-object v9, Lokhttp3/u;->d:Ljava/util/regex/Pattern;

    invoke-static {v14}, Lokhttp3/o;->f(Ljava/lang/String;)Lokhttp3/u;

    move-result-object v9

    .line 33
    iput-object v9, v2, Lretrofit2/l0;->u:Lokhttp3/u;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 34
    const-string v2, "Malformed content type: %s"

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_8
    if-eqz v11, :cond_9

    .line 35
    invoke-virtual {v12, v9, v14}, Lkotlin/jvm/internal/o;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 36
    :cond_9
    invoke-virtual {v12, v9, v14}, Lkotlin/jvm/internal/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v13, v13, 0x1

    move/from16 v9, p1

    goto :goto_1

    .line 37
    :cond_a
    const-string v0, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v2

    .line 38
    invoke-static {v1, v10, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 39
    throw v0

    .line 40
    :cond_b
    invoke-virtual {v12}, Lkotlin/jvm/internal/o;->f()Lokhttp3/q;

    move-result-object v7

    .line 41
    iput-object v7, v2, Lretrofit2/l0;->t:Lokhttp3/q;

    goto :goto_3

    .line 42
    :cond_c
    const-string v0, "@Headers annotation is empty."

    new-array v2, v5, [Ljava/lang/Object;

    .line 43
    invoke-static {v1, v10, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 44
    throw v0

    :cond_d
    move/from16 p1, v9

    .line 45
    instance-of v7, v11, Lretrofit2/http/Multipart;

    const-string v8, "Only one encoding annotation is allowed."

    if-eqz v7, :cond_f

    .line 46
    iget-boolean v7, v2, Lretrofit2/l0;->q:Z

    if-nez v7, :cond_e

    move/from16 v7, p1

    .line 47
    iput-boolean v7, v2, Lretrofit2/l0;->r:Z

    goto :goto_3

    .line 48
    :cond_e
    new-array v0, v5, [Ljava/lang/Object;

    .line 49
    invoke-static {v1, v10, v8, v0}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 50
    throw v0

    :cond_f
    move/from16 v7, p1

    .line 51
    instance-of v9, v11, Lretrofit2/http/FormUrlEncoded;

    if-eqz v9, :cond_11

    .line 52
    iget-boolean v9, v2, Lretrofit2/l0;->r:Z

    if-nez v9, :cond_10

    .line 53
    iput-boolean v7, v2, Lretrofit2/l0;->q:Z

    goto :goto_3

    .line 54
    :cond_10
    new-array v0, v5, [Ljava/lang/Object;

    .line 55
    invoke-static {v1, v10, v8, v0}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 56
    throw v0

    :cond_11
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 57
    :cond_12
    iget-object v4, v2, Lretrofit2/l0;->o:Ljava/lang/String;

    if-eqz v4, :cond_7f

    .line 58
    iget-boolean v4, v2, Lretrofit2/l0;->p:Z

    if-nez v4, :cond_15

    .line 59
    iget-boolean v4, v2, Lretrofit2/l0;->r:Z

    if-nez v4, :cond_14

    .line 60
    iget-boolean v4, v2, Lretrofit2/l0;->q:Z

    if-nez v4, :cond_13

    goto :goto_4

    .line 61
    :cond_13
    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v2, v5, [Ljava/lang/Object;

    .line 62
    invoke-static {v1, v10, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 63
    throw v0

    .line 64
    :cond_14
    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v2, v5, [Ljava/lang/Object;

    .line 65
    invoke-static {v1, v10, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 66
    throw v0

    .line 67
    :cond_15
    :goto_4
    iget-object v4, v2, Lretrofit2/l0;->e:[[Ljava/lang/annotation/Annotation;

    array-length v6, v4

    .line 68
    new-array v9, v6, [Lretrofit2/v;

    iput-object v9, v2, Lretrofit2/l0;->w:[Lretrofit2/v;

    add-int/lit8 v9, v6, -0x1

    move v11, v5

    :goto_5
    if-ge v11, v6, :cond_69

    .line 69
    iget-object v12, v2, Lretrofit2/l0;->w:[Lretrofit2/v;

    iget-object v13, v2, Lretrofit2/l0;->f:[Ljava/lang/reflect/Type;

    aget-object v13, v13, v11

    aget-object v14, v4, v11

    if-ne v11, v9, :cond_16

    const/4 v15, 0x1

    goto :goto_6

    :cond_16
    move v15, v5

    :goto_6
    if-eqz v14, :cond_66

    .line 70
    array-length v10, v14

    move v7, v5

    const/16 v16, 0x0

    :goto_7
    if-ge v7, v10, :cond_65

    aget-object v5, v14, v7

    move-object/from16 v18, v4

    .line 71
    instance-of v4, v5, Lretrofit2/http/Url;

    move/from16 v19, v4

    const-string v4, "@Path parameters may not be used with @Url."

    move/from16 v20, v6

    const-class v6, Ljava/lang/String;

    if-eqz v19, :cond_1f

    .line 72
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 73
    iget-boolean v5, v2, Lretrofit2/l0;->n:Z

    if-nez v5, :cond_1e

    .line 74
    iget-boolean v5, v2, Lretrofit2/l0;->j:Z

    if-nez v5, :cond_1d

    .line 75
    iget-boolean v4, v2, Lretrofit2/l0;->k:Z

    if-nez v4, :cond_1c

    .line 76
    iget-boolean v4, v2, Lretrofit2/l0;->l:Z

    if-nez v4, :cond_1b

    .line 77
    iget-boolean v4, v2, Lretrofit2/l0;->m:Z

    if-nez v4, :cond_1a

    .line 78
    iget-object v4, v2, Lretrofit2/l0;->s:Ljava/lang/String;

    if-nez v4, :cond_19

    const/4 v4, 0x1

    .line 79
    iput-boolean v4, v2, Lretrofit2/l0;->n:Z

    .line 80
    const-class v4, Lokhttp3/r;

    if-eq v13, v4, :cond_18

    if-eq v13, v6, :cond_18

    const-class v4, Ljava/net/URI;

    if-eq v13, v4, :cond_18

    instance-of v4, v13, Ljava/lang/Class;

    if-eqz v4, :cond_17

    move-object v4, v13

    check-cast v4, Ljava/lang/Class;

    .line 81
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android.net.Uri"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_17

    goto :goto_8

    .line 82
    :cond_17
    const-string v0, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 83
    :cond_18
    :goto_8
    new-instance v4, Lretrofit2/c0;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v11, v5}, Lretrofit2/c0;-><init>(Ljava/lang/reflect/Method;II)V

    move/from16 v19, v7

    :goto_9
    move-object/from16 v25, v8

    move/from16 v22, v9

    move/from16 v23, v10

    move-object/from16 v21, v12

    move/from16 v24, v15

    :goto_a
    const/16 v17, 0x2

    goto/16 :goto_12

    .line 84
    :cond_19
    iget-object v0, v2, Lretrofit2/l0;->o:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "@Url cannot be used with @%s URL"

    invoke-static {v1, v11, v2, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 85
    :cond_1a
    const-string v0, "A @Url parameter must not come after a @QueryMap."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1b
    const/4 v2, 0x0

    .line 86
    const-string v0, "A @Url parameter must not come after a @QueryName."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1c
    const/4 v2, 0x0

    .line 87
    const-string v0, "A @Url parameter must not come after a @Query."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1d
    const/4 v2, 0x0

    .line 88
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v4, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1e
    const/4 v2, 0x0

    .line 89
    const-string v0, "Multiple @Url method annotations found."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1f
    move/from16 v19, v7

    .line 90
    instance-of v7, v5, Lretrofit2/http/Path;

    move/from16 v21, v7

    iget-object v7, v2, Lretrofit2/l0;->a:Lretrofit2/p0;

    if-eqz v21, :cond_27

    .line 91
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 92
    iget-boolean v6, v2, Lretrofit2/l0;->k:Z

    if-nez v6, :cond_26

    .line 93
    iget-boolean v6, v2, Lretrofit2/l0;->l:Z

    if-nez v6, :cond_25

    .line 94
    iget-boolean v6, v2, Lretrofit2/l0;->m:Z

    if-nez v6, :cond_24

    .line 95
    iget-boolean v6, v2, Lretrofit2/l0;->n:Z

    if-nez v6, :cond_23

    .line 96
    iget-object v4, v2, Lretrofit2/l0;->s:Ljava/lang/String;

    if-eqz v4, :cond_22

    const/4 v4, 0x1

    .line 97
    iput-boolean v4, v2, Lretrofit2/l0;->j:Z

    .line 98
    check-cast v5, Lretrofit2/http/Path;

    .line 99
    invoke-interface {v5}, Lretrofit2/http/Path;->value()Ljava/lang/String;

    move-result-object v4

    .line 100
    sget-object v6, Lretrofit2/l0;->z:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-eqz v6, :cond_21

    .line 101
    iget-object v6, v2, Lretrofit2/l0;->v:Ljava/util/LinkedHashSet;

    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    .line 102
    invoke-virtual {v7, v13, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 103
    new-instance v6, Lretrofit2/e0;

    iget-object v7, v2, Lretrofit2/l0;->c:Ljava/lang/reflect/Method;

    invoke-interface {v5}, Lretrofit2/http/Path;->encoded()Z

    move-result v5

    invoke-direct {v6, v7, v11, v4, v5}, Lretrofit2/e0;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Z)V

    move-object v4, v6

    goto/16 :goto_9

    .line 104
    :cond_20
    iget-object v0, v2, Lretrofit2/l0;->s:Ljava/lang/String;

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "URL \"%s\" does not contain \"{%s}\"."

    invoke-static {v1, v11, v2, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 105
    :cond_21
    sget-object v0, Lretrofit2/l0;->y:Ljava/util/regex/Pattern;

    .line 106
    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v0

    .line 107
    const-string v2, "@Path parameter name must match %s. Found: %s"

    invoke-static {v1, v11, v2, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 108
    :cond_22
    iget-object v0, v2, Lretrofit2/l0;->o:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "@Path can only be used with relative url on @%s"

    invoke-static {v1, v11, v2, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_23
    const/4 v2, 0x0

    .line 109
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v4, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_24
    const/4 v2, 0x0

    .line 110
    const-string v0, "A @Path parameter must not come after a @QueryMap."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_25
    const/4 v2, 0x0

    .line 111
    const-string v0, "A @Path parameter must not come after a @QueryName."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_26
    const/4 v2, 0x0

    .line 112
    const-string v0, "A @Path parameter must not come after a @Query."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 113
    :cond_27
    instance-of v4, v5, Lretrofit2/http/Query;

    move/from16 v21, v4

    const-string v4, "<String>)"

    move/from16 v22, v9

    const-string v9, " must include generic type (e.g., "

    move/from16 v23, v10

    const-class v10, Ljava/lang/Iterable;

    if-eqz v21, :cond_2b

    .line 114
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 115
    check-cast v5, Lretrofit2/http/Query;

    .line 116
    invoke-interface {v5}, Lretrofit2/http/Query;->value()Ljava/lang/String;

    move-result-object v6

    .line 117
    invoke-interface {v5}, Lretrofit2/http/Query;->encoded()Z

    move-result v5

    move-object/from16 v21, v12

    .line 118
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v12

    move/from16 v24, v15

    const/4 v15, 0x1

    .line 119
    iput-boolean v15, v2, Lretrofit2/l0;->k:Z

    .line 120
    invoke-virtual {v10, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_29

    .line 121
    instance-of v10, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_28

    .line 122
    move-object v4, v13

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 123
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 124
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 125
    new-instance v4, Lretrofit2/a0;

    const/4 v7, 0x2

    invoke-direct {v4, v7, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    .line 126
    new-instance v5, Lretrofit2/y;

    invoke-direct {v5, v4, v10}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    :goto_b
    move-object v4, v5

    :goto_c
    move-object/from16 v25, v8

    goto/16 :goto_a

    :cond_28
    const/4 v10, 0x0

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    .line 130
    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 131
    :cond_29
    invoke-virtual {v12}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_2a

    .line 132
    invoke-virtual {v12}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lretrofit2/l0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 133
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 134
    new-instance v4, Lretrofit2/a0;

    const/4 v9, 0x2

    invoke-direct {v4, v9, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    .line 135
    new-instance v5, Lretrofit2/y;

    const/4 v15, 0x1

    invoke-direct {v5, v4, v15}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    move-object v4, v5

    :goto_d
    move-object/from16 v25, v8

    move/from16 v17, v9

    goto/16 :goto_12

    :cond_2a
    const/4 v9, 0x2

    .line 136
    invoke-virtual {v7, v13, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 137
    new-instance v4, Lretrofit2/a0;

    invoke-direct {v4, v9, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    goto :goto_d

    :cond_2b
    move-object/from16 v21, v12

    move/from16 v24, v15

    .line 138
    instance-of v12, v5, Lretrofit2/http/QueryName;

    if-eqz v12, :cond_2f

    .line 139
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 140
    check-cast v5, Lretrofit2/http/QueryName;

    .line 141
    invoke-interface {v5}, Lretrofit2/http/QueryName;->encoded()Z

    move-result v5

    .line 142
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v6

    const/4 v15, 0x1

    .line 143
    iput-boolean v15, v2, Lretrofit2/l0;->l:Z

    .line 144
    invoke-virtual {v10, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_2d

    .line 145
    instance-of v10, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_2c

    .line 146
    move-object v4, v13

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 147
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 148
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 149
    new-instance v4, Lretrofit2/f0;

    invoke-direct {v4, v5}, Lretrofit2/f0;-><init>(Z)V

    .line 150
    new-instance v5, Lretrofit2/y;

    invoke-direct {v5, v4, v10}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto/16 :goto_b

    :cond_2c
    const/4 v10, 0x0

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    .line 154
    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 155
    :cond_2d
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_2e

    .line 156
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lretrofit2/l0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 157
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 158
    new-instance v4, Lretrofit2/f0;

    invoke-direct {v4, v5}, Lretrofit2/f0;-><init>(Z)V

    .line 159
    new-instance v5, Lretrofit2/y;

    const/4 v15, 0x1

    invoke-direct {v5, v4, v15}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto/16 :goto_b

    .line 160
    :cond_2e
    invoke-virtual {v7, v13, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 161
    new-instance v4, Lretrofit2/f0;

    invoke-direct {v4, v5}, Lretrofit2/f0;-><init>(Z)V

    goto/16 :goto_c

    .line 162
    :cond_2f
    instance-of v12, v5, Lretrofit2/http/QueryMap;

    const-string v15, "Map must include generic types (e.g., Map<String, String>)"

    move/from16 v25, v12

    const-class v12, Ljava/util/Map;

    if-eqz v25, :cond_33

    .line 163
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 164
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    const/4 v9, 0x1

    .line 165
    iput-boolean v9, v2, Lretrofit2/l0;->m:Z

    .line 166
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_32

    .line 167
    invoke-static {v13, v4}, Lretrofit2/v;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 168
    instance-of v10, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_31

    .line 169
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 170
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v12

    if-ne v6, v12, :cond_30

    .line 171
    invoke-static {v9, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 172
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 173
    new-instance v4, Lretrofit2/b0;

    check-cast v5, Lretrofit2/http/QueryMap;

    .line 174
    invoke-interface {v5}, Lretrofit2/http/QueryMap;->encoded()Z

    move-result v5

    const/4 v6, 0x2

    invoke-direct {v4, v1, v11, v5, v6}, Lretrofit2/b0;-><init>(Ljava/lang/reflect/Method;IZI)V

    move/from16 v17, v6

    move-object/from16 v25, v8

    goto/16 :goto_12

    .line 175
    :cond_30
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@QueryMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_31
    const/4 v2, 0x0

    .line 176
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v15, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_32
    const/4 v2, 0x0

    .line 177
    const-string v0, "@QueryMap parameter type must be Map."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_33
    move-object/from16 v25, v8

    const/16 v17, 0x2

    .line 178
    instance-of v8, v5, Lretrofit2/http/Header;

    if-eqz v8, :cond_37

    .line 179
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 180
    check-cast v5, Lretrofit2/http/Header;

    .line 181
    invoke-interface {v5}, Lretrofit2/http/Header;->value()Ljava/lang/String;

    move-result-object v6

    .line 182
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v8

    .line 183
    invoke-virtual {v10, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_35

    .line 184
    instance-of v10, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_34

    .line 185
    move-object v4, v13

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 186
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 187
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 188
    new-instance v4, Lretrofit2/a0;

    invoke-interface {v5}, Lretrofit2/http/Header;->allowUnsafeNonAsciiValues()Z

    move-result v5

    const/4 v15, 0x1

    invoke-direct {v4, v15, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    .line 189
    new-instance v5, Lretrofit2/y;

    invoke-direct {v5, v4, v10}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    :goto_e
    move-object v4, v5

    goto/16 :goto_12

    :cond_34
    const/4 v10, 0x0

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    .line 193
    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 194
    :cond_35
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_36

    .line 195
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lretrofit2/l0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 196
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 197
    new-instance v4, Lretrofit2/a0;

    invoke-interface {v5}, Lretrofit2/http/Header;->allowUnsafeNonAsciiValues()Z

    move-result v5

    const/4 v15, 0x1

    invoke-direct {v4, v15, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    .line 198
    new-instance v5, Lretrofit2/y;

    invoke-direct {v5, v4, v15}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto :goto_e

    :cond_36
    const/4 v15, 0x1

    .line 199
    invoke-virtual {v7, v13, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 200
    new-instance v4, Lretrofit2/a0;

    invoke-interface {v5}, Lretrofit2/http/Header;->allowUnsafeNonAsciiValues()Z

    move-result v5

    invoke-direct {v4, v15, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    goto/16 :goto_12

    .line 201
    :cond_37
    instance-of v8, v5, Lretrofit2/http/HeaderMap;

    if-eqz v8, :cond_3c

    .line 202
    const-class v4, Lokhttp3/q;

    if-ne v13, v4, :cond_38

    .line 203
    new-instance v4, Lretrofit2/c0;

    const/4 v10, 0x0

    invoke-direct {v4, v1, v11, v10}, Lretrofit2/c0;-><init>(Ljava/lang/reflect/Method;II)V

    goto/16 :goto_12

    :cond_38
    const/4 v10, 0x0

    .line 204
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 205
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    .line 206
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_3b

    .line 207
    invoke-static {v13, v4}, Lretrofit2/v;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 208
    instance-of v8, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v8, :cond_3a

    .line 209
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 210
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v8

    if-ne v6, v8, :cond_39

    const/4 v15, 0x1

    .line 211
    invoke-static {v15, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 212
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 213
    new-instance v4, Lretrofit2/b0;

    check-cast v5, Lretrofit2/http/HeaderMap;

    .line 214
    invoke-interface {v5}, Lretrofit2/http/HeaderMap;->allowUnsafeNonAsciiValues()Z

    move-result v5

    invoke-direct {v4, v1, v11, v5, v15}, Lretrofit2/b0;-><init>(Ljava/lang/reflect/Method;IZI)V

    goto/16 :goto_12

    .line 215
    :cond_39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@HeaderMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 216
    :cond_3a
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v15, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 217
    :cond_3b
    const-string v0, "@HeaderMap parameter type must be Map or Headers."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 218
    :cond_3c
    instance-of v8, v5, Lretrofit2/http/Field;

    if-eqz v8, :cond_41

    .line 219
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 220
    iget-boolean v6, v2, Lretrofit2/l0;->q:Z

    if-eqz v6, :cond_40

    .line 221
    check-cast v5, Lretrofit2/http/Field;

    .line 222
    invoke-interface {v5}, Lretrofit2/http/Field;->value()Ljava/lang/String;

    move-result-object v6

    .line 223
    invoke-interface {v5}, Lretrofit2/http/Field;->encoded()Z

    move-result v5

    const/4 v15, 0x1

    .line 224
    iput-boolean v15, v2, Lretrofit2/l0;->g:Z

    .line 225
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v8

    .line 226
    invoke-virtual {v10, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v10

    if-eqz v10, :cond_3e

    .line 227
    instance-of v10, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_3d

    .line 228
    move-object v4, v13

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 229
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 230
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 231
    new-instance v4, Lretrofit2/a0;

    invoke-direct {v4, v10, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    .line 232
    new-instance v5, Lretrofit2/y;

    invoke-direct {v5, v4, v10}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto/16 :goto_e

    :cond_3d
    const/4 v10, 0x0

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    .line 236
    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3e
    const/4 v10, 0x0

    .line 237
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_3f

    .line 238
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lretrofit2/l0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 239
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 240
    new-instance v4, Lretrofit2/a0;

    invoke-direct {v4, v10, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    .line 241
    new-instance v5, Lretrofit2/y;

    const/4 v15, 0x1

    invoke-direct {v5, v4, v15}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto/16 :goto_e

    .line 242
    :cond_3f
    invoke-virtual {v7, v13, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 243
    new-instance v4, Lretrofit2/a0;

    invoke-direct {v4, v10, v6, v5}, Lretrofit2/a0;-><init>(ILjava/lang/String;Z)V

    goto/16 :goto_12

    :cond_40
    const/4 v10, 0x0

    .line 244
    const-string v0, "@Field parameters can only be used with form encoding."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 245
    :cond_41
    instance-of v8, v5, Lretrofit2/http/FieldMap;

    if-eqz v8, :cond_46

    .line 246
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 247
    iget-boolean v4, v2, Lretrofit2/l0;->q:Z

    if-eqz v4, :cond_45

    .line 248
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    .line 249
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_44

    .line 250
    invoke-static {v13, v4}, Lretrofit2/v;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 251
    instance-of v8, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v8, :cond_43

    .line 252
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 253
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v8

    if-ne v6, v8, :cond_42

    const/4 v15, 0x1

    .line 254
    invoke-static {v15, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 255
    invoke-virtual {v7, v4, v14}, Lretrofit2/p0;->e(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 256
    iput-boolean v15, v2, Lretrofit2/l0;->g:Z

    .line 257
    new-instance v4, Lretrofit2/b0;

    check-cast v5, Lretrofit2/http/FieldMap;

    .line 258
    invoke-interface {v5}, Lretrofit2/http/FieldMap;->encoded()Z

    move-result v5

    invoke-direct {v4, v1, v11, v5, v10}, Lretrofit2/b0;-><init>(Ljava/lang/reflect/Method;IZI)V

    goto/16 :goto_12

    .line 259
    :cond_42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@FieldMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_43
    const/4 v10, 0x0

    .line 260
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v15, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_44
    const/4 v10, 0x0

    .line 261
    const-string v0, "@FieldMap parameter type must be Map."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_45
    const/4 v10, 0x0

    .line 262
    const-string v0, "@FieldMap parameters can only be used with form encoding."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 263
    :cond_46
    instance-of v8, v5, Lretrofit2/http/Part;

    move/from16 v26, v8

    const-class v8, Lokhttp3/w;

    if-eqz v26, :cond_55

    .line 264
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 265
    iget-boolean v6, v2, Lretrofit2/l0;->r:Z

    if-eqz v6, :cond_54

    .line 266
    check-cast v5, Lretrofit2/http/Part;

    const/4 v15, 0x1

    .line 267
    iput-boolean v15, v2, Lretrofit2/l0;->h:Z

    .line 268
    invoke-interface {v5}, Lretrofit2/http/Part;->value()Ljava/lang/String;

    move-result-object v6

    .line 269
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v12

    .line 270
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_4d

    .line 271
    invoke-virtual {v10, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    sget-object v6, Lretrofit2/g0;->d:Lretrofit2/g0;

    const-string v7, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    if-eqz v5, :cond_49

    .line 272
    instance-of v5, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_48

    .line 273
    move-object v4, v13

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 274
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 275
    invoke-static {v4}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_47

    .line 276
    new-instance v4, Lretrofit2/y;

    invoke-direct {v4, v6, v10}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto/16 :goto_12

    .line 277
    :cond_47
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v7, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 278
    :cond_48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    .line 281
    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_49
    const/4 v10, 0x0

    .line 282
    invoke-virtual {v12}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_4b

    .line 283
    invoke-virtual {v12}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    .line 284
    invoke-virtual {v8, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_4a

    .line 285
    new-instance v4, Lretrofit2/y;

    const/4 v15, 0x1

    invoke-direct {v4, v6, v15}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto/16 :goto_12

    .line 286
    :cond_4a
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v7, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 287
    :cond_4b
    invoke-virtual {v8, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_4c

    move-object v4, v6

    goto/16 :goto_12

    .line 288
    :cond_4c
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v7, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 289
    :cond_4d
    const-string v15, "form-data; name=\""

    move-object/from16 v26, v5

    const-string v5, "\""

    .line 290
    invoke-static {v15, v6, v5}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 291
    const-string v6, "Content-Transfer-Encoding"

    .line 292
    invoke-interface/range {v26 .. v26}, Lretrofit2/http/Part;->encoding()Ljava/lang/String;

    move-result-object v15

    const-string v0, "Content-Disposition"

    filled-new-array {v0, v5, v6, v15}, [Ljava/lang/String;

    move-result-object v0

    .line 293
    invoke-static {v0}, Lokhttp3/o;->g([Ljava/lang/String;)Lokhttp3/q;

    move-result-object v0

    .line 294
    invoke-virtual {v10, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    const-string v6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    if-eqz v5, :cond_50

    .line 295
    instance-of v5, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_4f

    .line 296
    move-object v4, v13

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 297
    invoke-static {v10, v4}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 298
    invoke-static {v4}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_4e

    .line 299
    invoke-virtual {v7, v4, v14, v3}, Lretrofit2/p0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/m;

    move-result-object v4

    .line 300
    new-instance v5, Lretrofit2/d0;

    invoke-direct {v5, v1, v11, v0, v4}, Lretrofit2/d0;-><init>(Ljava/lang/reflect/Method;ILokhttp3/q;Lretrofit2/m;)V

    .line 301
    new-instance v0, Lretrofit2/y;

    invoke-direct {v0, v5, v10}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    :goto_f
    move-object v4, v0

    goto/16 :goto_12

    .line 302
    :cond_4e
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v6, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 303
    :cond_4f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 304
    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    .line 306
    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 307
    :cond_50
    invoke-virtual {v12}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_52

    .line 308
    invoke-virtual {v12}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lretrofit2/l0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 309
    invoke-virtual {v8, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_51

    .line 310
    invoke-virtual {v7, v4, v14, v3}, Lretrofit2/p0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/m;

    move-result-object v4

    .line 311
    new-instance v5, Lretrofit2/d0;

    invoke-direct {v5, v1, v11, v0, v4}, Lretrofit2/d0;-><init>(Ljava/lang/reflect/Method;ILokhttp3/q;Lretrofit2/m;)V

    .line 312
    new-instance v0, Lretrofit2/y;

    const/4 v15, 0x1

    invoke-direct {v0, v5, v15}, Lretrofit2/y;-><init>(Lretrofit2/v;I)V

    goto :goto_f

    :cond_51
    const/4 v10, 0x0

    .line 313
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v6, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_52
    const/4 v10, 0x0

    .line 314
    invoke-virtual {v8, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_53

    .line 315
    invoke-virtual {v7, v13, v14, v3}, Lretrofit2/p0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/m;

    move-result-object v4

    .line 316
    new-instance v5, Lretrofit2/d0;

    invoke-direct {v5, v1, v11, v0, v4}, Lretrofit2/d0;-><init>(Ljava/lang/reflect/Method;ILokhttp3/q;Lretrofit2/m;)V

    goto/16 :goto_e

    .line 317
    :cond_53
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v6, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_54
    const/4 v10, 0x0

    .line 318
    const-string v0, "@Part parameters can only be used with multipart encoding."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 319
    :cond_55
    instance-of v0, v5, Lretrofit2/http/PartMap;

    if-eqz v0, :cond_5b

    .line 320
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 321
    iget-boolean v0, v2, Lretrofit2/l0;->r:Z

    if-eqz v0, :cond_5a

    const/4 v4, 0x1

    .line 322
    iput-boolean v4, v2, Lretrofit2/l0;->h:Z

    .line 323
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    .line 324
    invoke-virtual {v12, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_59

    .line 325
    invoke-static {v13, v0}, Lretrofit2/v;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 326
    instance-of v9, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v9, :cond_58

    .line 327
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    .line 328
    invoke-static {v10, v0}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v9

    if-ne v6, v9, :cond_57

    .line 329
    invoke-static {v4, v0}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 330
    invoke-static {v0}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_56

    .line 331
    invoke-virtual {v7, v0, v14, v3}, Lretrofit2/p0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/m;

    move-result-object v0

    .line 332
    check-cast v5, Lretrofit2/http/PartMap;

    .line 333
    new-instance v4, Lretrofit2/d0;

    invoke-interface {v5}, Lretrofit2/http/PartMap;->encoding()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v11, v0, v5}, Lretrofit2/d0;-><init>(Ljava/lang/reflect/Method;ILretrofit2/m;Ljava/lang/String;)V

    goto/16 :goto_12

    .line 334
    :cond_56
    const-string v0, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_57
    const/4 v10, 0x0

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@PartMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_58
    const/4 v10, 0x0

    .line 336
    new-array v0, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v15, v0}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_59
    const/4 v10, 0x0

    .line 337
    const-string v0, "@PartMap parameter type must be Map."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5a
    const/4 v10, 0x0

    .line 338
    const-string v0, "@PartMap parameters can only be used with multipart encoding."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 339
    :cond_5b
    instance-of v0, v5, Lretrofit2/http/Body;

    if-eqz v0, :cond_5e

    .line 340
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 341
    iget-boolean v0, v2, Lretrofit2/l0;->q:Z

    if-nez v0, :cond_5d

    iget-boolean v0, v2, Lretrofit2/l0;->r:Z

    if-nez v0, :cond_5d

    .line 342
    iget-boolean v0, v2, Lretrofit2/l0;->i:Z

    if-nez v0, :cond_5c

    .line 343
    :try_start_1
    invoke-virtual {v7, v13, v14, v3}, Lretrofit2/p0;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/m;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v15, 0x1

    .line 344
    iput-boolean v15, v2, Lretrofit2/l0;->i:Z

    .line 345
    new-instance v4, Lretrofit2/z;

    invoke-direct {v4, v1, v11, v0}, Lretrofit2/z;-><init>(Ljava/lang/reflect/Method;ILretrofit2/m;)V

    goto/16 :goto_12

    :catch_1
    move-exception v0

    .line 346
    const-string v2, "Unable to create @Body converter for %s"

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v0, v11, v2, v3}, Lretrofit2/v;->o(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 347
    :cond_5c
    const-string v0, "Multiple @Body method annotations found."

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5d
    const/4 v10, 0x0

    .line 348
    const-string v0, "@Body parameters cannot be used with form or multi-part encoding."

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 349
    :cond_5e
    instance-of v0, v5, Lretrofit2/http/Tag;

    if-eqz v0, :cond_62

    .line 350
    invoke-virtual {v2, v11, v13}, Lretrofit2/l0;->c(ILjava/lang/reflect/Type;)V

    .line 351
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lretrofit2/l0;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    add-int/lit8 v4, v11, -0x1

    :goto_10
    if-ltz v4, :cond_61

    .line 352
    iget-object v5, v2, Lretrofit2/l0;->w:[Lretrofit2/v;

    aget-object v5, v5, v4

    .line 353
    instance-of v6, v5, Lretrofit2/h0;

    if-eqz v6, :cond_60

    check-cast v5, Lretrofit2/h0;

    iget-object v5, v5, Lretrofit2/h0;->d:Ljava/lang/Class;

    .line 354
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5f

    goto :goto_11

    .line 355
    :cond_5f
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "@Tag type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is duplicate of "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lretrofit2/i0;->b:Lretrofit2/b;

    .line 357
    invoke-virtual {v0, v1, v4}, Lretrofit2/b;->c(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " and would always overwrite its value."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    .line 358
    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_60
    :goto_11
    add-int/lit8 v4, v4, -0x1

    goto :goto_10

    .line 359
    :cond_61
    new-instance v4, Lretrofit2/h0;

    invoke-direct {v4, v0}, Lretrofit2/h0;-><init>(Ljava/lang/Class;)V

    goto :goto_12

    :cond_62
    const/4 v4, 0x0

    :goto_12
    if-nez v4, :cond_63

    goto :goto_13

    :cond_63
    if-nez v16, :cond_64

    move-object/from16 v16, v4

    :goto_13
    add-int/lit8 v7, v19, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v18

    move/from16 v6, v20

    move-object/from16 v12, v21

    move/from16 v9, v22

    move/from16 v10, v23

    move/from16 v15, v24

    move-object/from16 v8, v25

    const/4 v5, 0x0

    goto/16 :goto_7

    .line 360
    :cond_64
    const-string v0, "Multiple Retrofit annotations found, only one allowed."

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_65
    const/16 v17, 0x2

    :goto_14
    move-object/from16 v18, v4

    move/from16 v20, v6

    move-object/from16 v25, v8

    move/from16 v22, v9

    move-object/from16 v21, v12

    move/from16 v24, v15

    goto :goto_15

    :cond_66
    move/from16 v17, v7

    const/16 v16, 0x0

    goto :goto_14

    :goto_15
    if-nez v16, :cond_68

    if-eqz v24, :cond_67

    .line 361
    :try_start_2
    invoke-static {v13}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v4, Lh6/c;

    if-ne v0, v4, :cond_67

    const/4 v15, 0x1

    .line 362
    iput-boolean v15, v2, Lretrofit2/l0;->x:Z
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    const/16 v16, 0x0

    goto :goto_16

    .line 363
    :catch_2
    :cond_67
    const-string v0, "No Retrofit annotation found."

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    invoke-static {v1, v11, v0, v2}, Lretrofit2/v;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 364
    :cond_68
    :goto_16
    aput-object v16, v21, v11

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move/from16 v7, v17

    move-object/from16 v4, v18

    move/from16 v6, v20

    move/from16 v9, v22

    move-object/from16 v8, v25

    const/4 v5, 0x0

    const/4 v10, 0x0

    goto/16 :goto_5

    :cond_69
    move-object/from16 v25, v8

    .line 365
    iget-object v0, v2, Lretrofit2/l0;->s:Ljava/lang/String;

    if-nez v0, :cond_6b

    iget-boolean v0, v2, Lretrofit2/l0;->n:Z

    if-eqz v0, :cond_6a

    goto :goto_17

    .line 366
    :cond_6a
    iget-object v0, v2, Lretrofit2/l0;->o:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 367
    const-string v2, "Missing either @%s URL or @Url parameter."

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v0}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 368
    throw v0

    .line 369
    :cond_6b
    :goto_17
    iget-boolean v0, v2, Lretrofit2/l0;->q:Z

    if-nez v0, :cond_6c

    iget-boolean v3, v2, Lretrofit2/l0;->r:Z

    if-nez v3, :cond_6c

    iget-boolean v3, v2, Lretrofit2/l0;->p:Z

    if-nez v3, :cond_6c

    iget-boolean v3, v2, Lretrofit2/l0;->i:Z

    if-nez v3, :cond_6d

    :cond_6c
    const/4 v3, 0x0

    const/4 v10, 0x0

    goto :goto_18

    .line 370
    :cond_6d
    const-string v0, "Non-body HTTP method cannot contain @Body."

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 371
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 372
    throw v0

    :goto_18
    if-eqz v0, :cond_6f

    .line 373
    iget-boolean v0, v2, Lretrofit2/l0;->g:Z

    if-eqz v0, :cond_6e

    goto :goto_19

    .line 374
    :cond_6e
    const-string v0, "Form-encoded method must contain at least one @Field."

    new-array v2, v10, [Ljava/lang/Object;

    .line 375
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 376
    throw v0

    .line 377
    :cond_6f
    :goto_19
    iget-boolean v0, v2, Lretrofit2/l0;->r:Z

    if-eqz v0, :cond_71

    iget-boolean v0, v2, Lretrofit2/l0;->h:Z

    if-eqz v0, :cond_70

    goto :goto_1a

    .line 378
    :cond_70
    const-string v0, "Multipart method must contain at least one @Part."

    new-array v2, v10, [Ljava/lang/Object;

    .line 379
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 380
    throw v0

    .line 381
    :cond_71
    :goto_1a
    new-instance v0, Lretrofit2/m0;

    invoke-direct {v0, v2}, Lretrofit2/m0;-><init>(Lretrofit2/l0;)V

    .line 382
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 383
    invoke-static {v2}, Lretrofit2/v;->j(Ljava/lang/reflect/Type;)Z

    move-result v3

    if-nez v3, :cond_7e

    .line 384
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_7d

    .line 385
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    .line 386
    const-class v3, Ld6/s;

    const-class v4, Lretrofit2/n0;

    iget-boolean v5, v0, Lretrofit2/m0;->l:Z

    if-eqz v5, :cond_76

    .line 387
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v6

    .line 388
    array-length v7, v6

    const/4 v15, 0x1

    sub-int/2addr v7, v15

    aget-object v6, v6, v7

    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 389
    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v10, 0x0

    aget-object v6, v6, v10

    .line 390
    instance-of v7, v6, Ljava/lang/reflect/WildcardType;

    if-eqz v7, :cond_72

    .line 391
    check-cast v6, Ljava/lang/reflect/WildcardType;

    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v6

    aget-object v6, v6, v10

    .line 392
    :cond_72
    invoke-static {v6}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    const-class v8, Lretrofit2/e;

    if-ne v7, v4, :cond_73

    instance-of v7, v6, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_73

    .line 393
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v10, v6}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v9, 0x0

    goto :goto_1c

    .line 394
    :cond_73
    invoke-static {v6}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    if-eq v7, v8, :cond_75

    .line 395
    sget-boolean v7, Lretrofit2/v;->b:Z

    if-eqz v7, :cond_74

    if-ne v6, v3, :cond_74

    const/4 v7, 0x1

    goto :goto_1b

    :cond_74
    const/4 v7, 0x0

    :goto_1b
    move v9, v7

    const/4 v7, 0x0

    .line 396
    :goto_1c
    new-instance v10, Lretrofit2/r0;

    const/4 v15, 0x1

    new-array v11, v15, [Ljava/lang/reflect/Type;

    const/4 v12, 0x0

    aput-object v6, v11, v12

    const/4 v13, 0x0

    invoke-direct {v10, v13, v8, v11}, Lretrofit2/r0;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 397
    invoke-static {v2}, Lretrofit2/SkipCallbackExecutorImpl;->ensurePresent([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object v2

    move v6, v9

    :goto_1d
    move-object/from16 v8, p0

    goto :goto_1e

    :cond_75
    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 398
    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    .line 399
    invoke-static {v12, v6}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 400
    const-string v2, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s"

    invoke-static {v1, v13, v2, v0}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 401
    throw v0

    .line 402
    :cond_76
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    goto :goto_1d

    .line 403
    :goto_1e
    :try_start_3
    invoke-virtual {v8, v10, v2}, Lretrofit2/p0;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/g;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 404
    invoke-interface {v2}, Lretrofit2/g;->e()Ljava/lang/reflect/Type;

    move-result-object v9

    .line 405
    const-class v10, Lokhttp3/i0;

    if-eq v9, v10, :cond_7c

    if-eq v9, v4, :cond_7b

    .line 406
    iget-object v4, v0, Lretrofit2/m0;->d:Ljava/lang/String;

    move-object/from16 v10, v25

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_78

    const-class v4, Ljava/lang/Void;

    .line 407
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_78

    .line 408
    sget-boolean v4, Lretrofit2/v;->b:Z

    if-eqz v4, :cond_77

    if-ne v9, v3, :cond_77

    goto :goto_1f

    .line 409
    :cond_77
    const-string v0, "HEAD method must use Void or Unit as response type."

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 410
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 411
    throw v0

    .line 412
    :cond_78
    :goto_1f
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    .line 413
    :try_start_4
    invoke-virtual {v8, v9, v3}, Lretrofit2/p0;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/m;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 414
    iget-object v1, v8, Lretrofit2/p0;->b:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lokhttp3/d;

    if-nez v5, :cond_79

    .line 415
    new-instance v1, Lretrofit2/p;

    const/4 v6, 0x0

    move-object v5, v2

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lretrofit2/p;-><init>(Lretrofit2/m0;Lokhttp3/d;Lretrofit2/m;Lretrofit2/g;I)V

    return-object v1

    :cond_79
    move-object v5, v2

    move-object v2, v0

    if-eqz v7, :cond_7a

    .line 416
    new-instance v1, Lretrofit2/p;

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lretrofit2/p;-><init>(Lretrofit2/m0;Lokhttp3/d;Lretrofit2/m;Lretrofit2/g;I)V

    return-object v1

    .line 417
    :cond_7a
    new-instance v1, Lretrofit2/q;

    invoke-direct/range {v1 .. v6}, Lretrofit2/q;-><init>(Lretrofit2/m0;Lokhttp3/d;Lretrofit2/m;Lretrofit2/g;Z)V

    return-object v1

    :catch_3
    move-exception v0

    .line 418
    const-string v2, "Unable to create converter for %s"

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 419
    :cond_7b
    const-string v0, "Response must include generic type (e.g., Response<String>)"

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 420
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 421
    throw v0

    .line 422
    :cond_7c
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    invoke-static {v9}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    new-array v2, v10, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 424
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 425
    throw v0

    :catch_4
    move-exception v0

    .line 426
    const-string v2, "Unable to create call adapter for %s"

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7d
    const/4 v3, 0x0

    const/4 v10, 0x0

    .line 427
    const-string v0, "Service methods cannot return void."

    new-array v2, v10, [Ljava/lang/Object;

    .line 428
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 429
    throw v0

    :cond_7e
    const/4 v3, 0x0

    .line 430
    const-string v0, "Method return type must not include a type variable or wildcard: %s"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 431
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 432
    throw v0

    :cond_7f
    move-object v3, v10

    move v10, v5

    .line 433
    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    new-array v2, v10, [Ljava/lang/Object;

    .line 434
    invoke-static {v1, v3, v0, v2}, Lretrofit2/v;->m(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 435
    throw v0
.end method


# virtual methods
.method public abstract a(Lretrofit2/x;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
