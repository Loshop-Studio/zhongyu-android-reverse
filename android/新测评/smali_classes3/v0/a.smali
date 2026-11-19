.class public Lv0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/e;


# instance fields
.field public final a:Lm0/e;

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lm0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Li1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p1, p0, Lv0/a;->b:Landroid/content/res/Resources;

    .line 11
    .line 12
    invoke-static {p2}, Li1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lm0/e;

    .line 17
    .line 18
    iput-object p1, p0, Lv0/a;->a:Lm0/e;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm0/d;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/a;->a:Lm0/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lm0/e;->a(Ljava/lang/Object;Lm0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Ljava/lang/Object;IILm0/d;)Lo0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/a;->a:Lm0/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lm0/e;->b(Ljava/lang/Object;IILm0/d;)Lo0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lv0/a;->b:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-static {p2, p1}, Lv0/v;->c(Landroid/content/res/Resources;Lo0/j;)Lo0/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
