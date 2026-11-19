.class public interface abstract Lc2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc2/b;

    .line 2
    .line 3
    invoke-static {}, Lb2/e;->d()Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lc2/b;-><init>(Ljava/util/Calendar;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lc2/h;->a:Lc2/h;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract format(I)Ljava/lang/CharSequence;
.end method
