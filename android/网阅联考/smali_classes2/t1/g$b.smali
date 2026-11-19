.class public final Lt1/g$b;
.super Lt1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lt1/g$f;

.field public final b:Lt1/g$d;

.field public final c:Lt1/g$b;


# direct methods
.method public constructor <init>(Lt1/g$f;Lt1/g$d;Landroid/app/Activity;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lt1/b;-><init>()V

    .line 3
    iput-object p0, p0, Lt1/g$b;->c:Lt1/g$b;

    .line 4
    iput-object p1, p0, Lt1/g$b;->a:Lt1/g$f;

    .line 5
    iput-object p2, p0, Lt1/g$b;->b:Lt1/g$d;

    return-void
.end method

.method public synthetic constructor <init>(Lt1/g$f;Lt1/g$d;Landroid/app/Activity;Lt1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lt1/g$b;-><init>(Lt1/g$f;Lt1/g$d;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public a()Lh2/a$b;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lt1/g$b;->c()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lt1/g$g;

    .line 6
    .line 7
    iget-object v2, p0, Lt1/g$b;->a:Lt1/g$f;

    .line 8
    .line 9
    iget-object v3, p0, Lt1/g$b;->b:Lt1/g$d;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v4}, Lt1/g$g;-><init>(Lt1/g$f;Lt1/g$d;Lt1/m;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lh2/b;->a(Ljava/util/Set;Lg2/c;)Lh2/a$b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public b(Lcom/zykj/insight/ui/MainActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, Lv1/d;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
