.class public Lt1/a$b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt1/a$b;->p(Lcom/liulishuo/okdownload/a;Lr1/c;Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/liulishuo/okdownload/a;

.field public final synthetic b:Lr1/c;

.field public final synthetic c:Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;

.field public final synthetic d:Lt1/a$b;


# direct methods
.method public constructor <init>(Lt1/a$b;Lcom/liulishuo/okdownload/a;Lr1/c;Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt1/a$b$f;->d:Lt1/a$b;

    .line 2
    .line 3
    iput-object p2, p0, Lt1/a$b$f;->a:Lcom/liulishuo/okdownload/a;

    .line 4
    .line 5
    iput-object p3, p0, Lt1/a$b$f;->b:Lr1/c;

    .line 6
    .line 7
    iput-object p4, p0, Lt1/a$b$f;->c:Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt1/a$b$f;->a:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/liulishuo/okdownload/a;->r()Lp1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lt1/a$b$f;->a:Lcom/liulishuo/okdownload/a;

    .line 8
    .line 9
    iget-object v2, p0, Lt1/a$b$f;->b:Lr1/c;

    .line 10
    .line 11
    iget-object v3, p0, Lt1/a$b$f;->c:Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;

    .line 12
    .line 13
    invoke-interface {v0, v1, v2, v3}, Lp1/a;->p(Lcom/liulishuo/okdownload/a;Lr1/c;Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
