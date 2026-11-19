.class public Lm6/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm6/a;->dismiss()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lm6/a;


# direct methods
.method public constructor <init>(Lm6/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm6/a$c;->c:Lm6/a;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lm6/a$c;->c:Lm6/a;

    .line 2
    .line 3
    invoke-static {v0}, Lm6/a;->a(Lm6/a;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm6/a$c;->c:Lm6/a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lm6/a;->b(Lm6/a;Z)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method
