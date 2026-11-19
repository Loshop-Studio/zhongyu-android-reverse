.class public final La0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:La0/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, La0/a;->e(Ljava/util/Locale;)Z

    move-result v0

    invoke-direct {p0, v0}, La0/a$a;->c(Z)V

    return-void
.end method

.method private static b(Z)La0/a;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, La0/a;->h:La0/a;

    goto :goto_0

    :cond_0
    sget-object p0, La0/a;->g:La0/a;

    :goto_0
    return-object p0
.end method

.method private c(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La0/a$a;->a:Z

    .line 2
    sget-object p1, La0/a;->d:La0/c;

    iput-object p1, p0, La0/a$a;->c:La0/c;

    const/4 p1, 0x2

    .line 3
    iput p1, p0, La0/a$a;->b:I

    return-void
.end method


# virtual methods
.method public a()La0/a;
    .locals 4

    .line 1
    iget v0, p0, La0/a$a;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La0/a$a;->c:La0/c;

    sget-object v1, La0/a;->d:La0/c;

    if-ne v0, v1, :cond_0

    .line 2
    iget-boolean v0, p0, La0/a$a;->a:Z

    invoke-static {v0}, La0/a$a;->b(Z)La0/a;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, La0/a;

    iget-boolean v1, p0, La0/a$a;->a:Z

    iget v2, p0, La0/a$a;->b:I

    iget-object v3, p0, La0/a$a;->c:La0/c;

    invoke-direct {v0, v1, v2, v3}, La0/a;-><init>(ZILa0/c;)V

    return-object v0
.end method
