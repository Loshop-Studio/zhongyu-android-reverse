.class public final synthetic Lnb/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/play/SpeedRateAdapter;

.field public final synthetic d:Lnb/c0;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SpeedRateAdapter;Lnb/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/d0;->c:Lcom/zykj/view/board/play/SpeedRateAdapter;

    iput-object p2, p0, Lnb/d0;->d:Lnb/c0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/d0;->c:Lcom/zykj/view/board/play/SpeedRateAdapter;

    iget-object v1, p0, Lnb/d0;->d:Lnb/c0;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/play/SpeedRateAdapter;->a(Lcom/zykj/view/board/play/SpeedRateAdapter;Lnb/c0;Landroid/view/View;)V

    return-void
.end method
