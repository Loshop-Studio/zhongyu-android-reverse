.class public final Lt1/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lt1/g$f;

.field public final b:Lt1/g$d;

.field public c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lt1/g$f;Lt1/g$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lt1/g$a;->a:Lt1/g$f;

    .line 4
    iput-object p2, p0, Lt1/g$a;->b:Lt1/g$d;

    return-void
.end method

.method public synthetic constructor <init>(Lt1/g$f;Lt1/g$d;Lt1/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lt1/g$a;-><init>(Lt1/g$f;Lt1/g$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;)Lg2/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt1/g$a;->b(Landroid/app/Activity;)Lt1/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Landroid/app/Activity;)Lt1/g$a;
    .locals 0

    .line 1
    invoke-static {p1}, Lk2/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p1, p0, Lt1/g$a;->c:Landroid/app/Activity;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic build()Le2/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt1/g$a;->c()Lt1/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lt1/b;
    .locals 5

    .line 1
    iget-object v0, p0, Lt1/g$a;->c:Landroid/app/Activity;

    .line 2
    .line 3
    const-class v1, Landroid/app/Activity;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lk2/b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lt1/g$b;

    .line 9
    .line 10
    iget-object v1, p0, Lt1/g$a;->a:Lt1/g$f;

    .line 11
    .line 12
    iget-object v2, p0, Lt1/g$a;->b:Lt1/g$d;

    .line 13
    .line 14
    iget-object v3, p0, Lt1/g$a;->c:Landroid/app/Activity;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v0, v1, v2, v3, v4}, Lt1/g$b;-><init>(Lt1/g$f;Lt1/g$d;Landroid/app/Activity;Lt1/h;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
