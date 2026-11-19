.class public final synthetic Ll4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/policy/ui/PolicyDetailActivity;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/policy/ui/PolicyDetailActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/b;->a:Ljava/lang/String;

    iput-object p2, p0, Ll4/b;->b:Lcom/zykj/policy/ui/PolicyDetailActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll4/b;->a:Ljava/lang/String;

    iget-object v1, p0, Ll4/b;->b:Lcom/zykj/policy/ui/PolicyDetailActivity;

    invoke-static {v0, v1}, Lcom/zykj/policy/ui/PolicyDetailActivity;->n(Ljava/lang/String;Lcom/zykj/policy/ui/PolicyDetailActivity;)V

    return-void
.end method
