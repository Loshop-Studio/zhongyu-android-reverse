.class public final synthetic Lb5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lb5/i;


# direct methods
.method public synthetic constructor <init>(Lb5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/h;->a:Lb5/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/h;->a:Lb5/i;

    invoke-static {v0}, Lb5/i;->c(Lb5/i;)V

    return-void
.end method
