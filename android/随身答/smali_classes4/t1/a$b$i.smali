.class public Lt1/a$b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt1/a$b;->o(Lcom/liulishuo/okdownload/a;IILjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/liulishuo/okdownload/a;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/util/Map;

.field public final synthetic e:Lt1/a$b;


# direct methods
.method public constructor <init>(Lt1/a$b;Lcom/liulishuo/okdownload/a;IILjava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt1/a$b$i;->e:Lt1/a$b;

    .line 2
    .line 3
    iput-object p2, p0, Lt1/a$b$i;->a:Lcom/liulishuo/okdownload/a;

    .line 4
    .line 5
    iput p3, p0, Lt1/a$b$i;->b:I

    .line 6
    .line 7
    iput p4, p0, Lt1/a$b$i;->c:I

    .line 8
    .line 9
    iput-object p5, p0, Lt1/a$b$i;->d:Ljava/util/Map;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt1/a$b$i;->a:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/liulishuo/okdownload/a;->r()Lp1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lt1/a$b$i;->a:Lcom/liulishuo/okdownload/a;

    .line 8
    .line 9
    iget v2, p0, Lt1/a$b$i;->b:I

    .line 10
    .line 11
    iget v3, p0, Lt1/a$b$i;->c:I

    .line 12
    .line 13
    iget-object v4, p0, Lt1/a$b$i;->d:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, v3, v4}, Lp1/a;->o(Lcom/liulishuo/okdownload/a;IILjava/util/Map;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
