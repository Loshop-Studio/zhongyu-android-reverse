.class public final Lt1/g$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lt1/g$f;

.field public final b:Lt1/g$d;

.field public final c:Lt1/g$h;

.field public final d:I


# direct methods
.method public constructor <init>(Lt1/g$f;Lt1/g$d;Lt1/g$h;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt1/g$h$a;->a:Lt1/g$f;

    .line 5
    .line 6
    iput-object p2, p0, Lt1/g$h$a;->b:Lt1/g$d;

    .line 7
    .line 8
    iput-object p3, p0, Lt1/g$h$a;->c:Lt1/g$h;

    .line 9
    .line 10
    iput p4, p0, Lt1/g$h$a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lt1/g$h$a;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/insight/ui/MainViewModel;

    .line 6
    .line 7
    iget-object v1, p0, Lt1/g$h$a;->a:Lt1/g$f;

    .line 8
    .line 9
    invoke-static {v1}, Lt1/g$f;->c(Lt1/g$f;)Lm2/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lm2/a;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/http/bean/HeaderLiveData;

    .line 18
    .line 19
    iget-object v2, p0, Lt1/g$h$a;->a:Lt1/g$f;

    .line 20
    .line 21
    invoke-static {v2}, Lt1/g$f;->f(Lt1/g$f;)Lm2/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Lm2/a;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lu1/g;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Lcom/zykj/insight/ui/MainViewModel;-><init>(Lcom/zykj/http/bean/HeaderLiveData;Lu1/g;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 36
    .line 37
    iget v1, p0, Lt1/g$h$a;->d:I

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method
