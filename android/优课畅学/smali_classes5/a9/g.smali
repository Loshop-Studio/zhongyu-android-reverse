.class public La9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb9/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lb9/c;)V
    .locals 0

    .line 1
    check-cast p1, La9/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La9/g;->d(La9/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic b(Lb9/c;)V
    .locals 0

    .line 1
    check-cast p1, La9/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La9/g;->e(La9/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()La9/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public d(La9/e;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(La9/e;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic newInstance()Lb9/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, La9/g;->c()La9/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
