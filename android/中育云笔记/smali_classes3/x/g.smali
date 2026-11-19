.class public interface abstract Lx/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/g$a;
    }
.end annotation


# static fields
.field public static final a:Lx/g$a;

.field public static final b:Lx/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lx/g$a;->a:Lx/g$a;

    .line 2
    .line 3
    sput-object v0, Lx/g;->a:Lx/g$a;

    .line 4
    .line 5
    sget-object v0, Lx/e;->d:Lx/e;

    .line 6
    .line 7
    invoke-static {v0}, Lx/h;->a(Lx/e;)Lx/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lx/g;->b:Lx/g;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public abstract a(Lvc/c;)Ljava/lang/Object;
.end method
