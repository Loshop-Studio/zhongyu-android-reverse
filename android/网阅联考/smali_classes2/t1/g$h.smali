.class public final Lt1/g$h;
.super Lt1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt1/g$h$a;
    }
.end annotation


# instance fields
.field public final a:Lt1/g$f;

.field public final b:Lt1/g$d;

.field public final c:Lt1/g$h;

.field public d:Lm2/a;


# direct methods
.method public constructor <init>(Lt1/g$f;Lt1/g$d;Landroidx/lifecycle/SavedStateHandle;Ld2/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lt1/e;-><init>()V

    .line 3
    iput-object p0, p0, Lt1/g$h;->c:Lt1/g$h;

    .line 4
    iput-object p1, p0, Lt1/g$h;->a:Lt1/g$f;

    .line 5
    iput-object p2, p0, Lt1/g$h;->b:Lt1/g$d;

    .line 6
    invoke-virtual {p0, p3, p4}, Lt1/g$h;->b(Landroidx/lifecycle/SavedStateHandle;Ld2/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Lt1/g$f;Lt1/g$d;Landroidx/lifecycle/SavedStateHandle;Ld2/c;Lt1/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lt1/g$h;-><init>(Lt1/g$f;Lt1/g$d;Landroidx/lifecycle/SavedStateHandle;Ld2/c;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 2

    .line 1
    const-string v0, "com.zykj.insight.ui.MainViewModel"

    .line 2
    .line 3
    iget-object v1, p0, Lt1/g$h;->d:Lm2/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final b(Landroidx/lifecycle/SavedStateHandle;Ld2/c;)V
    .locals 3

    .line 1
    new-instance p1, Lt1/g$h$a;

    .line 2
    .line 3
    iget-object p2, p0, Lt1/g$h;->a:Lt1/g$f;

    .line 4
    .line 5
    iget-object v0, p0, Lt1/g$h;->b:Lt1/g$d;

    .line 6
    .line 7
    iget-object v1, p0, Lt1/g$h;->c:Lt1/g$h;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p1, p2, v0, v1, v2}, Lt1/g$h$a;-><init>(Lt1/g$f;Lt1/g$d;Lt1/g$h;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lt1/g$h;->d:Lm2/a;

    .line 14
    .line 15
    return-void
.end method
