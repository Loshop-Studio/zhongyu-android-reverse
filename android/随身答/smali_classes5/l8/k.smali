.class public interface abstract Ll8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/k$a;
    }
.end annotation


# static fields
.field public static final a:Ll8/k$a;

.field public static final b:Ll8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ll8/k$a;->a:Ll8/k$a;

    .line 2
    .line 3
    sput-object v0, Ll8/k;->a:Ll8/k$a;

    .line 4
    .line 5
    new-instance v0, Ll8/k$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Ll8/k$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ll8/k;->b:Ll8/k;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Ll8/r;Ljava/util/List;)V
.end method

.method public abstract b(Ll8/r;)Ljava/util/List;
.end method
