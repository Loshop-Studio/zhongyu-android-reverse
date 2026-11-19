.class public Lm5/g$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm5/g$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lm5/g$a;


# direct methods
.method public constructor <init>(Lm5/g$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm5/g$a$b;->a:Lm5/g$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm5/g$a$b;->a:Lm5/g$a;

    .line 2
    .line 3
    iget-object v0, v0, Lm5/g$a;->a:Lm5/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    const-string v2, "http request error."

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Lm5/c;->a(ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
