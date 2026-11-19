.class public final synthetic Lpb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lpb/d;


# direct methods
.method public synthetic constructor <init>(Lpb/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/b;->c:Lpb/d;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpb/b;->c:Lpb/d;

    invoke-static {v0, p1}, Lpb/d;->c(Lpb/d;Landroid/view/View;)V

    return-void
.end method
