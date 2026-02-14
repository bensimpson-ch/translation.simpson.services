package services.simpson.translation;

public record TranslationResponseMessage(
        String jobId,
        String title,
        String summary,
        String slug,
        String content
) {
}
