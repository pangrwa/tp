package seedu.address.model.client.exceptions;

/**
 * Signals that the operation will result in duplicate Persons (Persons are considered duplicates if they have the same
 * identity).
 */
public class DuplicatePolicyException extends RuntimeException {
    public DuplicatePolicyException() {
        super("Operation would result in duplicate policies");
    }
}
