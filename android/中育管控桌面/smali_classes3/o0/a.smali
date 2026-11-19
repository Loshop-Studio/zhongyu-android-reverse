.class public Lo0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/e;


# instance fields
.field public final a:Lf0/e;

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lf0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p1, p0, Lo0/a;->b:Landroid/content/res/Resources;

    .line 11
    .line 12
    invoke-static {p2}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lf0/e;

    .line 17
    .line 18
    iput-object p1, p0, Lo0/a;->a:Lf0/e;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILf0/d;)Lh0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->a:Lf0/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lf0/e;->a(Ljava/lang/Object;IILf0/d;)Lh0/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lo0/a;->b:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-static {p2, p1}, Lo0/v;->c(Landroid/content/res/Resources;Lh0/j;)Lh0/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public b(Ljava/lang/Object;Lf0/d;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo0/a;->a:Lf0/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lf0/e;->b(Ljava/lang/Object;Lf0/d;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
