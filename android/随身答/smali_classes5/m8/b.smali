.class public final synthetic Lm8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/o$c;


# instance fields
.field public final synthetic a:Ll8/o;


# direct methods
.method public synthetic constructor <init>(Ll8/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/b;->a:Ll8/o;

    return-void
.end method


# virtual methods
.method public final a(Ll8/e;)Ll8/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/b;->a:Ll8/o;

    invoke-static {v0, p1}, Lm8/d;->a(Ll8/o;Ll8/e;)Ll8/o;

    move-result-object p1

    return-object p1
.end method
