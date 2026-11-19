.class public final Lp5/x1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/MicroPhoneListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/x1;->d(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp5/x1$d;->a:Lx7/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public turnOffMicroPhone()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/x1$d;->a:Lx7/l;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public turnOnMicroPhone()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/x1$d;->a:Lx7/l;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method
