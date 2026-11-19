.class public final synthetic Lhb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/policy/ui/PolicyDetailActivity;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/policy/ui/PolicyDetailActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/b;->c:Ljava/lang/String;

    iput-object p2, p0, Lhb/b;->d:Lcom/zykj/policy/ui/PolicyDetailActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhb/b;->c:Ljava/lang/String;

    iget-object v1, p0, Lhb/b;->d:Lcom/zykj/policy/ui/PolicyDetailActivity;

    invoke-static {v0, v1}, Lcom/zykj/policy/ui/PolicyDetailActivity;->K(Ljava/lang/String;Lcom/zykj/policy/ui/PolicyDetailActivity;)V

    return-void
.end method
