.class public final Lcom/friday/common/helper/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/helper/b$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/friday/common/helper/b$a;

.field public static volatile b:Lcom/friday/common/helper/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/helper/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/helper/b$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/helper/b;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lcom/friday/common/helper/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->b:Lcom/friday/common/helper/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b(Lcom/friday/common/helper/b;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/friday/common/helper/b;->b:Lcom/friday/common/helper/b;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "toLowerCase(...)"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const-string v2, "SCHOOL_CODE"

    .line 23
    .line 24
    invoke-virtual {v0, v2, p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final B(I)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FOLDER_ORDER"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final C(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "ip"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "KEY_LECTURE_IP"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final D(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "NOTE_PATH"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final E(I)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "KEY_SHARE_ORDER"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final F(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const-string v0, "http"

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {p1, v0, v1}, Lqd/z;->M(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "NEW_TEACHER_HOST"

    .line 18
    .line 19
    invoke-virtual {v0, v2, p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "token"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "NEW_TEACHER_TOKEN"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final H(J)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ACCOUNT_ID"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;JZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "userName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "USER_NAME"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final J(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "KEY_AUTH_CODE"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final K(I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ROLE_TYPE"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;IZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final L(Z)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FBI_WARNING"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "fileName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->n()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->t()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, "/"

    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "objectKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->g()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->m()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v3, "http://"

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "."

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, "/"

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "http"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v0, v1, v2, v3}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const-string v0, "note_v2"

    .line 19
    .line 20
    invoke-static {p1, v0, v1, v2, v3}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "OSS_ENDPOINT"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "/"

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_1
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "KEY_AUTH_CODE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dev"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v0, v1, v2, v3, v4}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "friday-note-dev"

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "test"

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3, v4}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v0, "friday-note-test"

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    const-string v0, "friday-note"

    .line 35
    .line 36
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "CACHE_CODE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "toLowerCase(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "SCHOOL_CODE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "toLowerCase(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final j()I
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FOLDER_ORDER"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final k()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "KEY_LECTURE_IP"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "NOTE_PATH"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dev"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v0, v1, v2, v3, v4}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "oss-cn-shanghai.aliyuncs.com"

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v5, "test"

    .line 24
    .line 25
    invoke-static {v0, v5, v2, v3, v4}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    const-string v0, "oss-cn-hangzhou.aliyuncs.com"

    .line 33
    .line 34
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dev"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v0, v1, v2, v3, v4}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "dev/file"

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "test"

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3, v4}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v0, "test/file"

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    const-string v0, "cloudnote/notes"

    .line 35
    .line 36
    return-object v0
.end method

.method public final o()I
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ROLE_TYPE"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final p()I
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "KEY_SHARE_ORDER"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final q()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FBI_WARNING"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final r()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "NEW_TEACHER_HOST"

    .line 6
    .line 7
    const-string v2, "https://default"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v1, "http"

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {v0, v1, v3}, Lqd/z;->M(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    return-object v2
.end method

.method public final s()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "NEW_TEACHER_TOKEN"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final t()J
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ACCOUNT_ID"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public final u()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "USER_NAME"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    sget-object v0, Lg2/a;->a:Lg2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    sget-object v0, Lg2/a;->a:Lg2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/helper/b;->s()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public final y(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "account"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "ACCOUNT_NAME"

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "toLowerCase(...)"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const-string v2, "CACHE_CODE"

    .line 23
    .line 24
    invoke-virtual {v0, v2, p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
