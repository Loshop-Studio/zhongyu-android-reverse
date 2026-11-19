.class public Le/q/g/f;
.super Le/q/g/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/q/g/f$a;
    }
.end annotation


# static fields
.field public static final d:Z

.field public static final e:Le/q/g/f$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, Le/q/g/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/q/g/f$a;-><init>(Ld/f/b/c;)V

    sput-object v0, Le/q/g/f;->e:Le/q/g/f$a;

    const-string v0, "java.specification.version"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_9

    const-string v4, "$this$toIntOrNull"

    .line 1
    invoke-static {v0, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {v0, v4}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x30

    invoke-static {v5, v6}, Ld/f/b/d;->g(II)I

    move-result v6

    const v7, -0x7fffffff

    if-gez v6, :cond_3

    if-ne v4, v2, :cond_1

    goto :goto_4

    :cond_1
    const/16 v6, 0x2d

    if-ne v5, v6, :cond_2

    const/high16 v7, -0x80000000

    move v5, v2

    goto :goto_0

    :cond_2
    const/16 v6, 0x2b

    if-ne v5, v6, :cond_9

    move v5, v2

    move v6, v3

    goto :goto_1

    :cond_3
    move v5, v3

    :goto_0
    move v6, v5

    :goto_1
    const v8, -0x38e38e3

    move v9, v3

    move v10, v8

    :goto_2
    if-ge v5, v4, :cond_7

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0xa

    .line 3
    invoke-static {v11, v12}, Ljava/lang/Character;->digit(II)I

    move-result v11

    if-gez v11, :cond_4

    goto :goto_4

    :cond_4
    if-ge v9, v10, :cond_5

    if-ne v10, v8, :cond_9

    .line 4
    div-int/lit8 v10, v7, 0xa

    if-ge v9, v10, :cond_5

    goto :goto_4

    :cond_5
    mul-int/lit8 v9, v9, 0xa

    add-int v12, v7, v11

    if-ge v9, v12, :cond_6

    goto :goto_4

    :cond_6
    sub-int/2addr v9, v11

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    if-eqz v6, :cond_8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3

    :cond_8
    neg-int v0, v9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_3
    move-object v1, v0

    :cond_9
    :goto_4
    if-eqz v1, :cond_b

    .line 5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x9

    if-lt v0, v1, :cond_a

    goto :goto_5

    :catch_0
    :cond_a
    move v2, v3

    goto :goto_5

    :cond_b
    :try_start_0
    const-class v0, Ljavax/net/ssl/SSLSocket;

    const-string v1, "getApplicationProtocol"

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_5
    sput-boolean v2, Le/q/g/f;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le/q/g/h;-><init>()V

    return-void
.end method
